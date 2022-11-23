/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acConstructor;

/**
 *
 * @author MAM
 */
public class Ac {
    private String power;
    private String setAc;
    
    public Ac(String power, String setAc) {
        this.power = power;
        this.setAc = setAc;
    }
    
    public void on() {
        System.out.println("Nyalakan AC dengan menekan " + power);
    }
    
    public void setting() {
        System.out.println("Aturlah AC sesuai tingkat suhu yang kamu inginkan dengan menekan tombol " + setAc);
    }
    
    public void off() {
        System.out.println("Matikan AC dengan menekan lagi ");
    }
}
