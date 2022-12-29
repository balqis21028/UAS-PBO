/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.class_pegawai;

/**
 *
 * @author ASUS
 */
import java.time.*;

public class siakad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // contoh obyek data pegawai
        Class_pegawai p1 = new Class_pegawai("P01", "Bunga Citra", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
         
        // contoh obyek data pegawai dosen
        Class_dosen p2 = new Class_dosen("P02", "Ahmad Setiawan", 1, LocalDate.of(1979, 9, 17), "8888");
        p2.printPegawai();
         
        // contoh obyek data pegawai nondosen
        Class_nondosen p3 = new Class_nondosen("P03", "Muhammad Alif", 1, LocalDate.of(2008, 1, 25));
        p3.printPegawai();
    }   
}
