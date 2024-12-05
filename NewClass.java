
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

       
        ArrayList<String> fruits = new ArrayList<>();

       
        System.out.print("Nhập số lượng loại quả bạn muốn thêm vào danh sách: ");
        int numFruits = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

     
        for (int i = 0; i < numFruits; i++) {
            System.out.print("Nhập tên loại quả thứ " + (i + 1) + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        
        System.out.println("\nDanh sách các loại quả:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

     
        if (fruits.size() >= 3) {
            String thirdFruit = fruits.get(2);
            System.out.println("\nĐối tượng ở vị trí thứ 3: " + thirdFruit);
        } else {
            System.out.println("\nDanh sách không có đủ 3 phần tử để lấy đối tượng thứ 3.");
        }

      
        System.out.print("\nNhập tên loại quả để kiểm tra xem nó có trong danh sách không: ");
        String fruitToCheck = scanner.nextLine();
        boolean containsFruit = fruits.contains(fruitToCheck);
        System.out.println(fruitToCheck + " nằm trong danh sách: " + containsFruit);

       
        int size = fruits.size();
        System.out.println("Kích thước của ArrayList: " + size);


        scanner.close();
    }
}
