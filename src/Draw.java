import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int choice = -1;
        while (choice != 7) {
            System.out.println("Danh sách");
            System.out.println("1. Vẽ hình tam giác cân");
            System.out.println("2. Vẽ hình tam giác vuông xuôi trái");
            System.out.println("3. Vẽ hình tam giác vuông xuôi phải");
            System.out.println("4. Vẽ hình tam giác vuông ngược trái");
            System.out.println("5. Vẽ hình tam giác vuông ngược phải");
            System.out.println("6. Vẽ hình chữ nhật");
            System.out.println("0. Thoát khỏi chương trình");
            System.out.println("Nhập số");
            choice = inputNumber.nextInt();
            int width, length;
            int height;
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình tam giác cân");
                    System.out.println("Nhập chiều cao");
                    height = inputNumber.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác vuông xuôi trái");
                    System.out.println("Nhập chiều cao");
                    height = inputNumber.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Vẽ hình tam giác vuông xuôi phải");
                    System.out.println("Nhập chiều cao");
                    height = inputNumber.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Vẽ hình tam giác vuông ngược trái");
                    System.out.println("Nhập chiều cao");
                    height = inputNumber.nextInt();
                    for (int i = height; i >=1; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Vẽ hình tam giác vuông ngược phải");
                    System.out.println("Nhập chiều cao");
                    height = inputNumber.nextInt();
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("Nhập chiều dài");
                    length = inputNumber.nextInt();
                    System.out.println("Nhập chiều rộng");
                    width = inputNumber.nextInt();
                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= length; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn phù hợp");
            }
        }
    }
}
