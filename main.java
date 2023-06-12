package com.maulana_rafi.pbo.pertemuan3;

public class main {
    public static void main(String[] args) {
        //pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda", "Forza 250", 90000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "Tmax DX", 319000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "946", 181000000);

        /*mengisi atribut dari objek honda
        honda.merek = "Honda";
        honda.tipe = "Forza 250";
        honda.harga = 90000000;

        //mengisi atribut dari objek yamaha
        yamaha.merek = "Yamaha";
        yamaha.tipe = "Tmax DX";
        yamaha.harga = 319000000;

        //mengisi atribut dari objek vespa
        vespa.merek = "Vespa";
        vespa.tipe = "946";
        vespa.harga = 181000000;

        //menampilkan informasi dari objek honda
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();*/

        //Uji coba getter and setter
        System.out.println("Uji coba getter and setter");
        System.out.println("Motor dengan merek " + yamaha.getMerek() +
                           " dengan tipe " + yamaha.getTipe() +
                           " dengan harga " + yamaha.getHarga() +
                           " rupiah");
    }
}
