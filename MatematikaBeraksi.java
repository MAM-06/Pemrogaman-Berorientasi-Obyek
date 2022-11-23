/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikaberaksi;

/**
 *
 * @author MAM
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mymtk = new Matematika ();
        mymtk.settugas ("jawaban =");
        System.out.println ("" + mymtk.gettugas());
        mymtk.pertambahan(20, 20);
        mymtk.pengurangan(10, 5);
        mymtk.perkalian(10, 20);
        mymtk.pembagian(20, 2);
    }
    
}
