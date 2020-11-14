/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan48.kalkulator;

/**
 *
 * @author ACER
 */
public class Kalkulator{
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }


    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    void setNama(){
        System.out.println("Project Clculator");
    }
    void setNoteProject(String note){
        System.out.println(note);
    }
    
    
    double add(double val1, double val2){
        return val1+val2;
    }
    
    double minus(double val1, double val2){
        return val1-val2;
    }
    double multiplication(double val1, double val2){
        return val1*val2;
    }
    double division(double val1, double val2){
        return val1/val2;
        
        
    }
    
}
