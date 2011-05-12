/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetormi;

import models.Hotel;
import models.Quarto;
import dao.GenericDAO;

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
        hotel1.cadastrarCliente("Ryu", "120938578329", "ryu@haduuken.com", "1111-2424");
        hotel1.cadastrarCliente("Ken", "012345678901", "ken@haduken.com", "2424-6969");
        
        dao.begin();
        
        dao.createEntity("Hotel");
        
        dao.insertObject("Hotel", hotel1);
        
        dao.commit();       
        dao.close();
        
        Hotel hotel2 = new Hotel();
        hotel2.setNome("HOTEL 2");

        Quarto quarto2 = new Quarto();
        quarto2.setNum(2);
        hotel2.addQuarto(quarto2);
        
        dao.begin();
        
        dao.insertObject("Hotel", hotel2);
        
        dao.commit();
        dao.printDb();       
        dao.close();

//        -------------------------------------
        
//        dao.begin();
//        dao.printDb();
//        dao.close();
        
        
//        Calendar data = new GregorianCalendar();
//        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//        Date hj = data.getTime();
//        System.out.println(formatador.format(hj));
//        
//        System.out.println(data);
//        System.out.println(hj);
    }

}
