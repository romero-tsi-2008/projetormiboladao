/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.*;

/**
 *
 * @author romero
 */
public class GenericDAO {
    //escrita
    private FileOutputStream os; 
    private ObjectOutputStream oos;
    //leitura
    private FileInputStream is;
    private FileReader reader;
    private BufferedReader leitor;
    private ObjectInputStream ios;

    public GenericDAO(String arquivo) throws Exception {
        //escrita
        os = new FileOutputStream(arquivo);
        oos = new ObjectOutputStream(os);
        //leitura
        is = new FileInputStream(arquivo);
        reader = new FileReader(arquivo);
        leitor = new BufferedReader(reader);
        ios = new ObjectInputStream(is);
    }

    public void persist(Object obj) throws Exception {
        oos.writeObject(obj);
        oos.close();
    }

    public void printFile() throws Exception {
        Object linha = null;
        while (((linha = leitor.readLine()) != null) && (leitor.read() != -1)) {
            linha = ios.readObject();
            System.out.println(linha);
        }
    }

    public void close() throws Exception {
        oos.close();
    }
}
