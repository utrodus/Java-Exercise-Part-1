/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import javax.swing.JOptionPane;

/**
 *
 * @author come.said
 */


public class BangunDatar {
    public static void main(String[] args) {       
       try {  
        String userInput = JOptionPane.showInputDialog("Pilihlah Bangun datar yang ingin anda hitung luasnya : \n 1. Luas Persegi Panjang \n 2. Luas Trapesium \n 3. Luas Lingkaran ");
        int pilihanBangunDatar = Integer.parseInt(userInput);
     
        if ( pilihanBangunDatar == 1 ){
            // Luas Persegi Panjang
            // Input Panjang Persegi
            String panjangPersegi = JOptionPane.showInputDialog(" Masukkan Panjangnya : ");
            int pPersegi = Integer.parseInt(panjangPersegi);    
            
            // Input Lebar Persegi
            String lebarPersegi = JOptionPane.showInputDialog(" Masukkan Lebarnya : ");
            int lPersegi = Integer.parseInt(lebarPersegi);
            
            // Proses Menghitung Luas           
            int luas = pPersegi * lPersegi;
            JOptionPane.showMessageDialog(null, " Jadi Luas persegi panjang yaitu : " + luas);
            
        }else if ( pilihanBangunDatar == 2 ){
            // Luas Trapesium
            // Input Panjang Sisi sejajar
            String jumlahSisiSejajar1 = JOptionPane.showInputDialog(" Masukkan Panjang Sisi Sejajar yang pertama : ");
            int sisiSejajar1 = Integer.parseInt(jumlahSisiSejajar1);
            
            String jumlahSisiSejajar2 = JOptionPane.showInputDialog(" Masukkan Jumlah Sisi Sejajar yang kedua : ");
            int sisiSejajar2 = Integer.parseInt(jumlahSisiSejajar2);
            
            // Input Tinggi Trapesium
            String tinggiTrapesium = JOptionPane.showInputDialog(" Masukkan Tinggi Trapesium : ");
            int tTrapesium = Integer.parseInt(tinggiTrapesium);
            
            // Proses Menghitung Luas
            
            int luas = (sisiSejajar1 + sisiSejajar2) * tTrapesium / 2;
            JOptionPane.showMessageDialog(null, " Luas Trapesium yaitu : " + luas);
            
        }else if ( pilihanBangunDatar == 3 ){
            // Luas Lingkaran
            // Membuat variable phi 
            Double phi = 3.14;
            
            // Input Panjang Sisi sejajar
            String JariJari = JOptionPane.showInputDialog(" Masukkan Panjang Jari Jari Lingkaran : ");
            Double r = Double.valueOf(JariJari);                        
                                              
            // Proses Menghitung Luas
//            Double luas =  phi * (r  * r);
            Double luasL = phi * Math.pow(r, 2);
           
            JOptionPane.showMessageDialog(null, " Luas Lingkaran yaitu : " + luasL);            
        }
        
      }
      
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "Input yang anda Masukkan salah!");
        }
       
       
        
      
        
    }
}
