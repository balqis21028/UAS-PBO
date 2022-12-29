/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class_pegawai;

/**
 *
 * @author ASUS
 */
import java.time.*;

public class Class_pegawai {
    // atribut
    String idPegawai;
    String nama;
    int gol;
    LocalDate TTL;
     
    // constructor
    Class_pegawai(String id, String nama, int gol, LocalDate tgllhr){
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.TTL = tgllhr;
    }
     
    // method menghitung usia pegawai
    int Usia(){
        // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(this.TTL, today);
        return selisih.getYears();
    }
     
    // hitung gaji pokok berdasarkan golongan dan usia
    long Gapok(){
        long gapok = 0;
        if (this.gol == 1){
            if (this.Usia() < 40){
               gapok = 3000000;
            } else {
               gapok = 4500000;
            }
        } else if (this.gol == 2){
            if (this.Usia() < 40){
               gapok = 5000000;
            } else {
               gapok = 6000000;
            }
        }
        return gapok;
    }
     
    // mencetak data pegawai dan gaji pokoknya
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.TTL);
        System.out.println("Gaji Pokok   : Rp " + this.Gapok());
    }
}
