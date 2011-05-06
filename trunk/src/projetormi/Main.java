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
        GenericDAO dao = new GenericDAO("banco.txt");
        Hotel hotel1 = new Hotel();
        hotel1.setNome("HOTEL 1");

        Quarto quarto1 = new Quarto();
        quarto1.setNum(1);
        hotel1.addQuarto(quarto1);

        dao.createEntity("Hotel", hotel1);

        dao.commit();
        dao.printDb();
        dao.close();
        
    }

}
