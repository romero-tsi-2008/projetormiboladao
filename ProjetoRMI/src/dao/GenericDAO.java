/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.*;
import java.util.*;

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
    protected HashMap<String, ArrayList> banco;

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
        banco = new HashMap<String, ArrayList>();
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

    public void createEntity(String name, Object obj) throws DuplicatedEntityException {
        for (String s : banco.keySet()) {
            if (s.equals(name)) {
                throw new DuplicatedEntityException();
            }
        }

        if (banco.isEmpty()) {
            banco.put(name, new ArrayList<Object>());
            banco.get(name).add(obj);
        } else {
            if (banco.get(name).isEmpty()) {
                banco.get(name).add(obj);
            }
        }

    }

    public void removeEntity(String name) throws InexistentEntityException {
        for (String s : banco.keySet()) {
            if (s.equals(name)) {
                banco.remove(name);
                return;
            }
        }
        throw new InexistentEntityException();
    }

//    public void insert(String entityName, String rowName, Object value) {
//        for (Map.Entry<String, ArrayList> entrada : banco.entrySet()) {
//            if (entrada.getKey().equals(entityName)) {
//                System.out.println(entrada.getValue());
//            }
//        }
//    }

    public void printDb() throws Exception {
        try {
            Object linha = null;
            while (((linha = leitorBuffer.readLine()) != null) && (leitorBuffer.read() != -1)) {
                linha = (HashMap<String, ArrayList>) ios.readObject();
//                for (ArrayList<Object> ar : linha) {
//
//                }
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}