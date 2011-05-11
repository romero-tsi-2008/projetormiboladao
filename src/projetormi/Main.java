/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetormi;

import dao.GenericDAO;
import models.Hotel;
import models.Quarto;

/**
 *
 * @author romero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        GenericDAO dao = new GenericDAO("banco.bin");
        
        Hotel hotel1 = new Hotel();
        hotel1.setNome("HOTEL 1");

        Quarto quarto1 = new Quarto();
        quarto1.setNum(1);
        hotel1.addQuarto(quarto1);

        dao.createEntity("Hotel");
        
        dao.insert("Hotel", hotel1);
        
        dao.commit();       
        dao.printDb();
        
//        dao.removeEntity("Hotel");
//        dao.commit();
//        dao.printDb();
        
        dao.close();
        
        dao = new GenericDAO("banco.bin");
        
        Hotel hotel2 = new Hotel();
        hotel2.setNome("HOTEL 2");

        Quarto quarto2 = new Quarto();
        quarto2.setNum(2);
        hotel2.addQuarto(quarto2);
        
        dao.insert("Hotel", hotel2);
        
        dao.commit();
        dao.printDb();
        dao.close();
    }

}
