/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Hotel;
import exceptions.DuplicatedEntityException;
import exceptions.InexistentEntityException;

/**
 *
 * @author romero
 */
public class GenericDAO {

    protected static File arquivo;
    //escrita
    protected FileOutputStream os;
    protected ObjectOutputStream oos;
    //leitura
    protected FileInputStream is;
    protected FileReader reader;
    protected BufferedReader leitorBuffer;
    protected ObjectInputStream ios;
    protected static HashMap<String, ArrayList<Object>> banco;
    private String nomeBanco = "banco.bin";

    public GenericDAO() throws Exception {
        if (new File(nomeBanco).exists()) {
            arquivo = new File(nomeBanco).getAbsoluteFile();
//            System.out.println("Ja existia");
            is = new FileInputStream(arquivo);
            ios = new ObjectInputStream(is);
            banco = (HashMap<String, ArrayList<Object>>)ios.readObject();
            ios.close();
            is.close();
        } else {
            arquivo = new File(nomeBanco);
//            System.out.println("NOVO");
            os = new FileOutputStream(arquivo);
            oos = new ObjectOutputStream(os);
            banco = new HashMap<String, ArrayList<Object>>();
            oos.writeObject(banco);
//            System.out.println("escreveu");
            oos.close();
            os.close();
        }
        //escrita
        //leitura
//        reader = new FileReader(arquivo);
//        leitorBuffer = new BufferedReader(reader);
//        //banco
//        banco = new HashMap<String, ArrayList<Object>>();
    }

    private HashMap<String, ArrayList<Object>> getBanco() {
        try{
            return banco;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void begin() throws Exception {
    	os = new FileOutputStream(arquivo);
        oos = new ObjectOutputStream(os);
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

    public boolean insertObject(String entityName, Object value) throws InexistentEntityException {
    	if(banco.containsKey(entityName)) {
    		banco.get(entityName).add(value);
    		return true;
    	}
        throw new InexistentEntityException();
    }
    

    
    public void printDb() throws Exception {
        try {
//            HashMap<String, ArrayList> b = (HashMap<String, ArrayList>) ios.readObject();
            
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