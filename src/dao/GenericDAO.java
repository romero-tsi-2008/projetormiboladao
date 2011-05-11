/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.*;
import java.util.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import exceptions.DuplicatedEntityException;
import exceptions.InexistentEntityException;

/**
 *
 * @author romero
 */
public class GenericDAO {

    protected File arquivo;
    //escrita
    protected FileOutputStream os;
    protected ObjectOutputStream oos;
    //leitura
    protected FileInputStream is;
    protected FileReader reader;
    protected BufferedReader leitorBuffer;
    protected ObjectInputStream ios;
    protected HashMap<String, ArrayList<Object>> banco;
    private String nomeBanco;

    public GenericDAO(String nomeBanco) throws Exception {
        if (new File(nomeBanco).exists()) {
            arquivo = new File(nomeBanco).getAbsoluteFile();
            System.out.println("Ja existia");
        } else {
            arquivo = new File(nomeBanco);
            System.out.println("NOVO");
        }
        //escrita
        os = new FileOutputStream(arquivo);
        oos = new ObjectOutputStream(os);
        //leitura
        is = new FileInputStream(arquivo);
        ios = new ObjectInputStream(is);
        reader = new FileReader(arquivo);
        leitorBuffer = new BufferedReader(reader);
        //banco
        banco = new HashMap<String, ArrayList<Object>>();
    }

    private HashMap<String, ArrayList<Object>> getBanco() {
        try{
            if(banco == null) {
                if(new File(nomeBanco).exists()) {
                    FileInputStream file = new FileInputStream(nomeBanco);
                    ObjectInputStream ob = new ObjectInputStream(file);
                    banco = (HashMap<String, ArrayList<Object>>) ob.readObject();
                    ob.close();
                    file.close();
                } else {
                    FileOutputStream file = new FileOutputStream(nomeBanco);
                    ObjectOutput ob = new ObjectOutputStream(file);
                    banco = new HashMap<String, ArrayList<Object>>();
                    ob.writeObject(banco);
                    ob.close();
                    file.close();
                }
            }
            return banco;

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void commit() throws Exception {
        try {
            oos.writeObject(banco);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() throws Exception {
        oos.close();
    }

    public void createEntity(String name) throws DuplicatedEntityException {
        for (String s : banco.keySet()) {
            if (s.equals(name)) {
                throw new DuplicatedEntityException();
            }
        }
            banco.put(name, new ArrayList<Object>());
    }

    public void removeEntity(String entityName) throws InexistentEntityException {
        for (String s : banco.keySet()) {
            if (s.equals(entityName)) {
                banco.remove(entityName);
                return;
            }
        }
        throw new InexistentEntityException();
    }

    public void insert(String entityName, Object value) throws InexistentEntityException {
        for (Map.Entry<String, ArrayList<Object>> entrada : banco.entrySet()) {
            if (entrada.getKey().equals(entityName)) {
                entrada.getValue().add(value);
                return;
            }
        }
        throw new InexistentEntityException();
    }

    public void printDb() throws Exception {
        try {
            HashMap<String, ArrayList> b = (HashMap<String, ArrayList>) ios.readObject();
            
//            System.out.println(b);
            for (Map.Entry<String, ArrayList<Object>> entrada : banco.entrySet()) {
                    System.out.println(entrada.getKey());
                    for (int i = 0; i < entrada.getValue().size(); i++) {
                    	System.out.println(entrada.getValue().get(i).toString());
                    }
            }

//            Object linha = null;
//            while (((linha = leitorBuffer.readLine()) != null) && (leitorBuffer.read() != -1)) {
//                linha = (HashMap<String, ArrayList>) ios.readObject();
////                for (ArrayList<Object> ar : linha) {
////
////                }
//                System.out.println(linha);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}