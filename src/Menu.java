import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int choice = -1;

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác");
            System.out.println("3. Vẽ hình vuông");
            System.out.println("0. Thoát khỏi chương trình");
            System.out.println("Nhập số");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 3:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn phù hợp");
            }
        }
    }
}
