/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("Persegi");
        persegi.setSisi(5);
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());
        System.out.println("------------------");

        System.out.println("Persegi Panjang");
        persegiPanjang.setPanjang(5);
        persegiPanjang.setLebar(4);
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());
        System.out.println("------------------");

        System.out.println("Segitiga");
        segitiga.setAlas(4);
        segitiga.setTinggi(3);
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
        System.out.println("------------------");

        System.out.println("Lingkaran");
        lingkaran.setJariJari(21);
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.luas());
        System.out.println("------------------");

    }
}
