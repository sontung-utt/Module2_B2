import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int num1 = inputNumber.nextInt();
        System.out.println("Nhập số thứ hai");
        int num2 = inputNumber.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if(num1 == 0 || num2 == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " +  num1);
    }
}
