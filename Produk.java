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
public class Produk extends Jenis{
    String produk ;
   
    public void produk (String produksi)
    {
        produk =produksi;
        System.out.println ("produksi : " +produk);
    }
}
