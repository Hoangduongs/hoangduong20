/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.mavenproject1;


import java.util.ArrayList;
import java.util.Scanner;
public class IntTreeNode {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

       
        ArrayList<String> fruits = new ArrayList<>();

       
        System.out.print("Nhap so luong loai qua muon cho vao: ");
        int numFruits = scanner.nextInt();
        scanner.nextLine();

     
        for (int i = 0; i < numFruits; i++) {
            System.out.print("Nhap ten loai qua " + (i + 1) + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        
        System.out.println("\nDanh sach cho:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

     
        if (fruits.size() >= 3) {
            String thirdFruit = fruits.get(2);
            System.out.println("\nDoi tuong o vi tri thu 3: " + thirdFruit);
        } else {
            System.out.println("\nDanh sach khong co đu 3 phan tu đe lay đoi tuong thu 3.");
        }

      
        System.out.print("\nNhap ten loai qua đe kiem tra xem no co trong danh sach khong: ");
        String fruitToCheck = scanner.nextLine();
        boolean containsFruit = fruits.contains(fruitToCheck);
        System.out.println(fruitToCheck + " nam trong danh sach: " + containsFruit);

       
        int size = fruits.size();
        System.out.println("Kích thước của ArrayList: " + size);


        scanner.close();
    }
    } 

