package com.maulana_rafi.pbo.pertemuan3;

public class SepedaMotor
{
    //Atributs
    private String merek;
    private String tipe;
    private int harga;

    //constructor
    public SepedaMotor(){}
    public SepedaMotor(String merek, String tipe, int harga)
    {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }
    public void showInfo()
    {
        System.out.println("Merek motor adalah: " + merek);
        System.out.println("Tipe motor adalah: " + tipe);
        System.out.println("Harga motor adalah: " + harga);
    }


    //getter and setter
    public String getMerek() {
        return merek;
    }
    public String setMerek(String merek) {
        return this.merek = merek;
    }
    public String getTipe() {
        return tipe;
    }
    public String setTipe(String tipe) {
        return this.tipe = tipe;
    }
    public int getHarga() {
        return harga;
    }

    public int setHarga(int harga) {
        return this.harga = harga;
    }
}
