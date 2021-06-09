/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMAD
 */
public class Konstruktor {

    int volume, tinggi, lebar, panjang;

    void Konstruktor(int panjang,int lebar, int tinggi) {
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    void hitung() {
        volume = panjang*lebar*tinggi;
        System.out.println(" kembalian anda sebesar = " + volume);
    }
}
