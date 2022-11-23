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
class Matematika {
    private String tugas ;
    
    public void settugas (String tugas){
        this.tugas = tugas;
    }
    
    public String gettugas (){
        return tugas;
    }

    
    public void pertambahan (int a, int b) {
        int hasil = a + b ;
        System.out.println("Hasil =" + (a+b));
    }
    void pengurangan (int a, int b) {
        int hasil = a - b ;
        System.out.println("Hasil =" + (a-b));
    }
    void perkalian (int a, int b) {
        int hasil = a * b ;
        System.out.println("Hasil =" + (a*b));
    }
    void pembagian (int a, int b) {
        int hasil = a / b ;
        System.out.println("Hasil =" + (a/b));
}
}