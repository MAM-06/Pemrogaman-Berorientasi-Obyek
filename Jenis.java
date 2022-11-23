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
public class Jenis {
    String tipe;
    int isi ;
   
    void tipe (String warna)
    {
        tipe=warna;
        System.out.println ("tipe : " +tipe);
    }
   
    void isi (int jumlah)
    {
        isi=jumlah;
        System.out.println ("Jumlah : " +isi);
    }
}
