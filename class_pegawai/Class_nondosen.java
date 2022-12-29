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

public class Class_nondosen extends Class_pegawai {
    // constructor
    Class_nondosen(String id, String nama, int gol, LocalDate tgllhr){
        super(id, nama, gol, tgllhr);
    }
 
    // menghitung tunjangan pegawai nondosen
    long TunjPegawai(){
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }
         
    // menghitung total gaji
    long TotalGaji(){
        long total = this.Gapok() + this.TunjPegawai();
        return total;
    }
     
    // cetak data pegawai, rincian gaji, total gaji
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.TTL);
        System.out.println("Usia         : " + this.Usia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.Gapok());
        System.out.println("Tunj Pegawai : Rp " + this.TunjPegawai());
        System.out.println("Total Gaji   : Rp " + this.TotalGaji());
    }
}
