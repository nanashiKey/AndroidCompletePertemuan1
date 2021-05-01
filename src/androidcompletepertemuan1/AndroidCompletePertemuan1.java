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
public class AndroidCompletePertemuan1 {
    /**
     * @param args the command line arguments
     * main method (spesial method untuk mengeksekusi program)
     */
    public static void main(String[] args) {
       int nilai = 10;
       float nilaiDesimal1 = 10.2f;
       double nilaiDesimal2 = 10.9;
       char karakter = 'c';
       boolean status = false;
       long nilaiPanjang = 10000000L;
       
       System.out.println(nilai);
       System.out.println(nilaiDesimal1);
       System.out.println(nilaiDesimal2);
       System.out.println(karakter);
       System.out.println(status);
       System.out.println(nilaiPanjang);
       
       //test case penamaan variable
       String $nama = "namanyaSiapa";
       String con1toh = "test";
       String rfo = "test";
       String tidakBolehAdaSpasi = "oke";
       
       //operator aritmatika  + - * / %
       int nilai1 = 100;
       int nilai2 = 34;
       int nilaiTambah = nilai1 + nilai2;
       int nilaiKurang = nilai1 - nilai2;
       int nilaiKali = nilai1 * nilai2;
       int nilaiBagi = nilai1/nilai2;
       int nilaiModulo = nilai1%nilai2;
       
       System.out.println("------Operator Aritmatik------");
       System.out.println("hasil tambah nilai1 + nilai2 adalah = "+nilaiTambah);
       System.out.println("hasil kurang nilai1 - nilai2 adalah = "+nilaiKurang);
       System.out.println("hasil kali nilai1 * nilai2 adalah = "+nilaiKali);
       System.out.println("hasil bagi nilai1 / nilai2 adalah = "+nilaiBagi);
       System.out.println("hasil modulo nilai1 % nilai2 adalah = "+nilaiModulo);
     
       //operator pembanding
       boolean apakahSama = nilaiTambah == nilaiKali;
       boolean apakahKurangDari = nilaiKali < nilaiBagi;
       boolean apakahLebihDari = nilaiModulo > nilaiTambah;   
       boolean apakahTidakSama = nilaiTambah != nilaiKali;
       boolean apakahKurangDariSamaDengan = nilaiKali <= nilaiBagi;
       boolean apakahLebihDariSamaDengan = nilaiBagi >= nilaiKali;

       //hasil menggunakan operator ternary
       String hasilPersamaan = apakahSama ? "Betul" : "Salah";
       String hasilKurangDari = apakahKurangDari ? "Betul" : "Salah";
       String hasilLebihDari = apakahLebihDari ? "Betul" : "Salah";
       String hasilTidakSama = apakahTidakSama ? "Betul" : "Salah";
       String hasilKurangDariSamaDengan = apakahKurangDariSamaDengan ? "Betul" : "Salah";
       String hasilLebihDariSamaDengan = apakahLebihDariSamaDengan ? "Betul" : "Salah";
       //jika menggunakan konsep if else maka akan seperti : 
       String contohHasil = "";
       if(apakahSama == true){
           contohHasil = "Betul";
       }else{
           contohHasil = "Salah";
       }
       
       System.out.println("------Operater Pembanding-------");
       System.out.println("apakah nilaiTambah sama dengan nilaiKali, jawabannya adalah "+hasilPersamaan);
       System.out.println("apakah nilaiKali kurang dari nilaiBagi, jawabannya adalah "+hasilKurangDari);
       System.out.println("apakah nilaiModulo lebih dari nilaiTambah, jawabannya adalah "+hasilLebihDari);
       System.out.println("apakah nilaiTambah tidak sama dengan nilaiKali, jawabannya adalah "+hasilTidakSama);
       System.out.println("apakah nilaiKali kurang dari sama dengan nilaiBagi, jawabannya adalah "+hasilKurangDariSamaDengan);
       System.out.println("apakah nilaiBagi lebih dari sama dengan nilaiKali, jawabannya adalah "+hasilLebihDariSamaDengan);
       
       //contoh operasi bitwise
       int a = 1; //nilai biner 0001
       int b = 3; //nilai biner 0011
       int c = b<<1; // hasilnya bergeser 1 bit ke kiri menjadi 0110
       int d = c>>1; //hasilnya bergeser 1 bit ke kanan menjadi 0011
       int e = a&b; //hasilnya 1 karena hasil dari 0001 AND 0011 adalah 0001
       int f = a|b; //hasilnya 3 karena hasil dari 0001 OR 0011 adalah 0011
       System.out.println(d);
       
       //contoh untuk class diluar class AndroidCompletePertemuan1
       //dengan case class Kendaraan
       Kendaraan mobil = new Kendaraan();
       mobil.jenisKendaraan = "angkutan umum";
       mobil.merkKendaraan = "Toyota";
       
       System.out.println("-----Class Kendaraan-----");
       System.out.println("jenis kendaraan "+mobil.jenisKendaraan);
       System.out.println("jumlah roda "+mobil.getRodaMobil());      
       System.out.println("merk kendaraan "+mobil.merkKendaraan);
    
       Kendaraan mobil2 = new Kendaraan();
       mobil2.merkKendaraan = "Honda";
       mobil2.jenisKendaraan = "Mobil Keluarga";
       
       System.out.println("jenis kendaraan "+mobil2.jenisKendaraan);
       System.out.println("jumlah roda "+mobil2.getRodaMobil());      
       System.out.println("merk kendaraan "+mobil2.merkKendaraan);
    }

}
