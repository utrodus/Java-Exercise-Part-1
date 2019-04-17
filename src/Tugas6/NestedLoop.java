/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author comesaid
 */
public class NestedLoop {
    public static void main(String[] args) {
        // Nested loop ( looping bersarang) atau pengulangan didalam pengulangan
        
        System.out.println("Bentuk segitiga dengan bintang rata kiri");
        // Membuat bentuk segitiga dengan bintang rata kiri        
        for (int x=1; x<=6;x++){
            // looping luar
            // memberi jarak perbaris atau menambah spasi ke bawah
            System.out.println(" ");           
            
            for(int y = 1; y<=x; y++){
                // looping dalam
                // menampilkan bintang
                System.out.print("*");
            }
            
        }
        
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Bentuk segitiga dengan bintang rata kiri dibalik");
        
        // Membuat bentuk segitiga dengan bintang rata kiri dibalik
        for(int c = 1; c<=6; c++){
            // looping luar
            // memberi spasi kebawah atau baris baru
            System.out.println(" ");
            
            for(int d = 6; d>=c; d--){
                // looping dalam
                // menampilkan bintang
                System.out.print("*");
            }
            
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Bentuk segitiga dengan bintang rata kanan");
        System.out.println(" ");
        // Membuat bentuk segitiga dengan bintang rata kanan
        for(int a = 1; a<=6; a++){
            
            //looping luar
            
            for (int i = 6; i >= a; i--) {
                //looping dalam
                // memberi spasi dari kiri ke kanan sebanyak i kali
                System.out.print(" ");
            }
                                    
            for(int b = 1; b<=a; b++){
                //looping dalam
                // menampilkan bintang
                System.out.print("*");
            }
            // memberi spasi kebawah atau baris baru
            System.out.println("");
            
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Bentuk segitiga dengan bintang rata kanan terbalik");
        System.out.println(" ");
        
        // Membuat bentuk segitiga dengan bintang rata kanan terbalik
        for(int a = 1; a<=6; a++){
            
            //looping luar
            
            for (int i = 1; i <= a; i++) {
                // looping dalam
                // memberi spasi dari kiri ke kanan sebanyak i kali
                System.out.print(" ");
            }
                                    
            for(int b = 6; b>=a; b--){
                //looping dalam
                // menampilkan bintang
                System.out.print("*");
            }
            // memberi spasi kebawah atau baris baru
            System.out.println("");
            
        }
        
        System.out.println(" ");
        
    }
}
