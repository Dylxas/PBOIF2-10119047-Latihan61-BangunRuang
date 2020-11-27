/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan61.bangunruang;


import data.Bola;
import data.Kerucut;
import data.Tabung;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG VOLUME BANGUN RUANG
 */

public class PBOIF210119047Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.printf("Hasil : V = %.1f cm^3 \n", bola.volume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil : V = %.0f cm^3 \n", tabung.volume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil : V = %.0f cm^3 \n", kerucut.volume());
        
    }
    
}
