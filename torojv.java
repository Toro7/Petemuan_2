/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;

public class HargaMakanan {
    public static void main(String[] args) {
        
        String makanan;
        Scanner userInput = new Scanner(System.in);
        double harga = 0;
        
        System.out.println("1. Siomay");
        System.out.println("2. Bakso");
        System.out.println("3. Steak");
        System.out.println("4. Mie Ayam");
        
        System.out.print("Masukkan Nama Makanan: ");
        makanan = userInput.nextLine();
        
        switch (makanan){
            case "Siomay":
                harga = 5000;
                break;
            case "Bakso":
                harga = 8000;
                break;
            case "Steak":
                harga = 15000;
                break;
            case "Mie Ayam":
                harga = 7000;
                break;
            default:
                System.out.println("Makanan Tidak Tersedia");
        }
        
        System.out.println("Anda Membeli " + makanan + " dengan Harga " + harga);
    }
}
