/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI GF63
 */

    /*

nama : Zahid Rizqullah Asahy
no nim : 2301093009
soal no 1
*/

import java.util.Scanner;
public class latihan1pbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan nilai bilangan 1");
        int nilai1 = scanner.nextInt();
        System.out.println("masukan nilai bilangan 2");
        int nilai2 = scanner.nextInt();
        System.out.println("masukan nilai bilangan 3");
        int nilai3 = scanner.nextInt();
        scanner.close();

        float rata_rata = (nilai1 + nilai2 + nilai3)/3;

        if (rata_rata >= 60){
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }
    }
}

