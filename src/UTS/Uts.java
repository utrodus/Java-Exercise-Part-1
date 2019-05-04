/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import javax.swing.JOptionPane;

/**
 *
 * @author saidalbaqi
 */

public class Uts {

    public static void main(String[] args) {
        //deklarasi variable
        int Menu, pakWiwi = 0, pakWowo = 0, Golput = 0, Responden = 0;

        String UserInput;
        boolean isRunning = true;

        // Pengulangan Voting dengan While
        while (isRunning) {
            try {
                JOptionPane.showMessageDialog(null, "Selamat Datang di pemilihan Presiden");
                UserInput = JOptionPane.showInputDialog("Pemilihan Presiden, Silahkan Pilih menu dibawah ini "
                        + " \n 1. Pak Wiwi "
                        + " \n 2. Pak Wowo "
                        + " \n 3. Golput "
                        + " \n 4. Ketil 4 Untuk Melihat Hasil Untuk Rekapitulasi "
                        + " \n \n Rekapitulasi"
                        + " \n"
                        + " Responden : " + Responden
                        + "\n Wiwi : " + pakWiwi
                        + "\n Wowo : " + pakWowo
                        + "\n Golput : " + Golput);
                Menu = Integer.valueOf(UserInput);
                Responden = Responden + 1;

                if (Menu < 1 || Menu > 4) {
                    JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
                } else {
                    if (Menu == 1) {
                        pakWiwi = pakWiwi + 1;
                        System.out.println("");
                        System.out.println("================");
                        System.out.println("Responden ke : " + Responden);
                        System.out.println("Memilih Pak Wiwi");

                    } else if (Menu == 2) {
                        pakWowo = 1 + pakWowo;
                        System.out.println("");
                        System.out.println("================");
                        System.out.println("Responden ke : " + Responden);
                        System.out.println("Memilih Pak Wowo");

                    } else if (Menu == 3) {
                        Golput = 1 + Golput;
                        System.out.println("");
                        System.out.println("================");
                        System.out.println("Responden ke : " + Responden);
                        System.out.println("Memilih Golput");

                    } else if (Menu == 4) {
                        JOptionPane.showMessageDialog(null, " Rekapitulasi "
                                + "\n ==========================================="
                                + "\n Total Responden : " + Responden 
                                + "\n Total Pemilih Wiwi : " + pakWiwi + " Dan Presentasenya Sebanyak :" +(pakWiwi * 100) / Responden +"%"
                                + "\n Total Pemilih Wowo : " + pakWowo + " Dan Presentasenya Sebanyak :" +(pakWowo * 100) / Responden +"%"
                                + "\n Total Golput : " + Golput + " Dan Presentase Sebanyak :" +(Golput * 100) / Responden +"%"
                                + "\n ===========================================");
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
            }
        }

    }
}