import java.util.Scanner;

public class Manager {
    Student[] students = {};

    public void display(){
        for (int i = 0; i < students.length; i++) {
            System.out.println("tên là : " +students[i].name + " - " + "age = " + students[i].age);
        }
    }

    public void addStudent(Student student){
        Student[] newArray = new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }
        newArray[newArray.length - 1] = student;
        students = newArray;
    }

    public Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id student");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập address");
        String address = scanner.nextLine();
        return new Student(id,name,age,address);
    }
}
