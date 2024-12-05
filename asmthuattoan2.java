/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.*;
public class asmthuattoan2 {
    
    static class Student {
        private String id;
        private String name;
        private double marks;

        public Student(String id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public String getId() { return id; }
        public double getMarks() { return marks; }

        @Override
        public String toString() {
            return String.format("ID: %s | Name: %s | Marks: %.2f", id, name, marks);
        }
    }

    static class StudentManager {
        private List<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void sortStudentsByInsertionSort() {
            for (int i = 1; i < students.size(); i++) {
                Student key = students.get(i);
                int j = i - 1;

                while (j >= 0 && students.get(j).getMarks() > key.getMarks()) {
                    students.set(j + 1, students.get(j));
                    j--;
                }
                students.set(j + 1, key);
            }
            System.out.println("Students sorted using Insertion Sort.");
        }

        public void sortStudentsByQuickSort() {
            quickSort(0, students.size() - 1);
            System.out.println("Students sorted using Quick Sort.");
        }

        private void quickSort(int low, int high) {
            if (low < high) {
                int pi = partition(low, high);
                quickSort(low, pi - 1);
                quickSort(pi + 1, high);
            }
        }

        private int partition(int low, int high) {
            double pivot = students.get(high).getMarks();
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (students.get(j).getMarks() <= pivot) {
                    i++;
                    Collections.swap(students, i, j);
                }
            }
            Collections.swap(students, i + 1, high);
            return i + 1;
        }

        public void displayAllStudents() {
            students.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Sort Students Using Insertion Sort");
            System.out.println("4. Sort Students Using Quick Sort");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    manager.addStudent(new Student(id, name, marks));
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    manager.sortStudentsByInsertionSort();
                    manager.displayAllStudents();
                    break;
                case 4:
                    manager.sortStudentsByQuickSort();
                    manager.displayAllStudents();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


