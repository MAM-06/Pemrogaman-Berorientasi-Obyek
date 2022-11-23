/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author MAM
 */
public class Rokok {
    public static void main (String[] args)
    {
        Produk kelinci = new Produk();
       
        System.out.println ("rokokku biasanya : ");
        kelinci.tipe("pack");
        kelinci.isi(12);
        kelinci.produk("gudang garam");
       
    }
}
