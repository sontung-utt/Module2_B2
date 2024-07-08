import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        //Bài 2
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Ứng dụng tiền lãi cho vay");
        System.out.println("Nhập số tháng gửi tiền");
        int month = inputNumber.nextInt();
        System.out.println("Nhập số tiền");
        double money = inputNumber.nextDouble();
        System.out.println("Nhập tỉ giá");
        double interestRate = inputNumber.nextDouble();
        double totalMoney = 0;
        for(int i = 0; i <= month; i++){
            totalMoney += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi gửi là: " + totalMoney);
    }
}
