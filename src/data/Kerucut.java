/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Aldy
 */
public class Kerucut extends BangunRuang {
    
    private int tinggi;
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        double volume = ((Math.PI * Math.pow(jariJari, 2)) * tinggi) / 3;
        return volume;
    }
    
    
}
