/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG VOLUME BANGUN RUANG
 */
public class Bola extends BangunRuang{
    @Override
    public double volume(){
        double volume = (Math.PI * Math.pow(jariJari, 3) * 4/3);
        return volume;
    }
}
