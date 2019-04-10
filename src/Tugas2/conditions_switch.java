/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author come.said
 */
public class conditions_switch {
    public static void main(String[] args) {
        // Program konversi nilai huruf menjadi angka
        
        // input nilai Huruf 
        String nilai = "B";
        
        
        switch(nilai){
            case  "A":
                System.out.println("nilai >= 91 dan <= 100 ");
                break;
            
            case  "A-":
                System.out.println("nilai >= 86 dan <= 90");
                break;    
            
            case  "B+":
                System.out.println("nilai >= 81 dan <= 85");
                break;
            
            case  "B":
                System.out.println("nilai >= 75 dan <= 80");
                break;
                
            case  "B-":
                System.out.println("nilai >= 71 dan <= 74");
                break;
                
            case  "C+":
                System.out.println("nilai >= 66 dan <= 70");
                break; 
            
            case  "C":
                System.out.println("nilai >= 61 dan <= 65");
                break;
                
            case  "C-":
                System.out.println("nilai >= 56 dan <= 60");
                break;
            
            case  "D":
                System.out.println("nilai >= 51 dan <= 55");
                break;
            
            case  "E":
                System.out.println("nilai >= 0 dan <= 50");
                break;
                
            default :
                System.out.println("Input yang anda masukkan tidak valid");
                       
        }
    }
}
