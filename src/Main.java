import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý học viên");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("chức năng hiển thị");
                    manager.display();
                    break;
                case 2:
                    System.out.println("chức năng thêm");
                    Student student = manager.createStudent();
                    manager.addStudent(student);
                    break;
                case 3:
                    System.out.println("chức năng sửa");
                    break;
                case 4:
                    System.out.println("chức năng xóa");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("vui lòng nhập đúng");
            }
        }
    }
}