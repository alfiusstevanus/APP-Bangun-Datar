/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author rdFah
 */
public class Lingkaran extends BangunDatar{
    private double PHI = 3.14;
    private double jariJari;

    public Lingkaran() {
    }

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getPHI() {
        return PHI;
    }

    public void setPHI(double PHI) {
        this.PHI = PHI;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    
    
    @Override
    double luas() {
        return 2 * (PHI * jariJari * jariJari);
    }

    @Override
    double keliling() {
        return 2*PHI*jariJari;
    }
    
}
