/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidcompletepertemuan1;

/**
 *
 * @author irfanasidiq
 */
public class Kendaraan {
    int jumlahRoda;
    String merkKendaraan;
    String jenisKendaraan;
    private final int jumlahRodaMobil = 4; //final adalah penjelasan untuk sebuah nilai konstanta 
    private final double nilaiPhi = 3.14;
    //contoh method yang tidak memerlukan nilai balik/return
    public void simpanNamaKendaraan(String namakendaraan){
        //isinya nanti menyimpan nama kendaraan
    }
    
    //contoh method yang memerlukan nilai balik/return int
    public int getRodaMobil(){
        return jumlahRodaMobil;
    }
    
    //contoh method yang memerlukan nilai balik/return double    
    public double getPhi(){
        return nilaiPhi;
    }
    
}
