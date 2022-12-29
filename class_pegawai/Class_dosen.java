/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class_pegawai;

/**
 *
 * @author ASUS
 */
import java.time.*;

public class Class_dosen extends Class_pegawai {
    // atribut tambahan untuk dosen
    String nidn;
     
    // constructor
    Class_dosen(String id, String nama, int gol, LocalDate tgllhr, String nidn){
        super(id, nama, gol, tgllhr);
        this.nidn = nidn;
    }
 
    // menghitung tunjangan pegawai dosen
    long hitungTunjPegawai(){
        long tunjPegawai = 2000000;
        return tunjPegawai;
    }
     
    // menghitung tunjangan fungsional dosen
    long hitungTunjFungsional(){
        long tunjFungsional;
        if (this.Usia() < 40){
            tunjFungsional = 2300000;
        } else {
            tunjFungsional = 27000000;
        }
         
        return tunjFungsional;
    }
     
    // menghitung total gaji
    long TotalGaji(){
        long total = this.Gapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }
     
    // cetak data pegawai, rincian gaji, total gaji
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.TTL);
        System.out.println("NIDN         : " + this.nidn);
        System.out.println("Usia         : " + this.Usia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.Gapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsi  : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji   : Rp " + this.TotalGaji());
    }
}
