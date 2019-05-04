/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import javax.swing.JOptionPane;

/**
 *
 * @author saidalbaqi
 */
public class inputUser_Joption {
    public static void main(String[] args) {
        String nilai = JOptionPane.showInputDialog("Masukkan Nilai Angka");
        int nilaiBaru = Integer.parseInt(nilai);                
                                                
        // merubah nilainya
        if(nilaiBaru < 0 || nilaiBaru > 100) {
            JOptionPane.showMessageDialog(null, "Nilai yang anda masukkan salah");            
        }else{
            if(nilaiBaru >= 91 && nilaiBaru <= 100 ){
                JOptionPane.showMessageDialog(null, "Konversi nilainya yaitu : A" );
            }else if (nilaiBaru >= 86 && nilaiBaru <= 90 ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : A-" );
            }else if (nilaiBaru >= 81 && nilaiBaru <= 85  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : B+" );
            }else if (nilaiBaru >= 76 && nilaiBaru <= 80  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : B" );
            }else if (nilaiBaru >= 71 && nilaiBaru <= 75  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : B-" );
            }else if (nilaiBaru >= 66 && nilaiBaru <= 70  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : C+" );
            }else if (nilaiBaru >= 61 && nilaiBaru <= 65  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : C" );
            }else if (nilaiBaru >= 56 && nilaiBaru <= 60  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : C-" );
            }else if (nilaiBaru >= 51 && nilaiBaru <= 55  ){
                 JOptionPane.showMessageDialog(null,"Konversi nilainya yaitu : D" );
            }else{
                JOptionPane.showMessageDialog(null,"Konversi Nilainya yaitu E");                
            }
        
         }
    }
}
