/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan48.kalkulator;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Kalkulator
 */



public class PBOIF210119056Latihan48Kalkulator {

    public static void main(String[] args) {
        Kalkulator kalkulator= new Kalkulator();
        
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        System.out.println("VALUE 1 = "+ kalkulator.getValue1());
        System.out.println("VALUE 2 = "+ kalkulator.getValue2());
        kalkulator.setNama();
        kalkulator.setNoteProject("This project shown you how to manage methode in java");
        System.out.println("Result Add is = "+kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = "+kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = "+kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is = "+kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));

        
    }
    
}
