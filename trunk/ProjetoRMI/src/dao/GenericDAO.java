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
    //escrita

    protected FileOutputStream os;
    protected ObjectOutputStream oos;
    //leitura
    protected FileInputStream is;
    protected FileReader reader;
    protected BufferedReader leitorBuffer;
    protected ObjectInputStream ios;
    protected static HashMap<String, ArrayList> banco;

    public GenericDAO(String arquivo) throws Exception {
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

    public void commit(Object obj) throws Exception {
        oos.writeObject(obj);
    }

    public void close() throws Exception {
        oos.close();
    }

    public void createEntity(String name, Object obj) {
        banco.put(name, new ArrayList<Object>());
    }

    public void removeEntity(String name) {
        for (String s : banco.keySet()) {
            if (s.equals(name)) {
                banco.remove(name);
            }
        }
    }

//    public void insert(String entityName, String rowName, Object value) {
//        for (Map.Entry<String, ArrayList> entrada : banco.entrySet()) {
//            if (entrada.getKey().equals(entityName)) {
//                System.out.println(entrada.getValue());
//            }
//        }
//    }

//    public void printFile() throws Exception {
//        Object linha = null;
//        while (((linha = leitorBuffer.readLine()) != null) && (leitorBuffer.read() != -1)) {
//            linha = ios.readObject();
//            System.out.println(linha);
//        }
//    }
}
