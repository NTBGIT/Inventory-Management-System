/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nevzat_taha_batmaz_hw2;

/**
 *
 * @author Taha
 */
public class Nevzat_Taha_Batmaz_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         inventory mydb = new inventory();
     /*  
      mydb.addTransistor("And Gate", 12);
        mydb.addInductor("20", 16);
        mydb.addCapacitor("10", "Silicon", 18);
        mydb.addResistor("1000", 100);
        mydb.addResistor("1000", 200);
        mydb.deleteCapacitor("10","Silicon",16);
        mydb.deleteResistor("1000", 50);
        mydb.deleteInductor("20", 16);
        mydb.deleteTransistor("And Gate", 13); */
        
        //Sadece print işlemi tanımlandı lürfen istediğiniz işlemi giriniz(add , delete )
      
         mydb.printInventory();
        // TODO code application logic here
    }
    
}
