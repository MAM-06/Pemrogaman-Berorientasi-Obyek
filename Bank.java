/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author MAM
 */
public class Bank {
    
    private int Saldo;
    private int Tambahan;
    private int Ambil;

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public void setTambahan(int Tambahan) {
        this.Tambahan = Tambahan;
    }

    public void setAmbil(int Ambil) {
        this.Ambil = Ambil;
    }
    
    
    
    
    
    public Bank(int Saldo, int Tambahan, int Ambil){
      this.Saldo = Saldo;
      this.Tambahan = Tambahan;
      this.Ambil = Ambil;
    }
    public void info(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini " + "= " + Saldo);
        
        System.out.println("Simpan uang " + "= " + Tambahan);
        int HasilTambah = Saldo + Tambahan;
        System.out.println("Saldo saat ini " + "= " + HasilTambah);
        
        System.out.println("Ambil uang " + "= " + Ambil);
        int HasilAmbil = HasilTambah - Ambil;
        System.out.println("Saldo saat ini " + "= " + HasilAmbil);
    }
}
