import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Kiểm tra số nguyên tố
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố");
        int number;
        do{
            System.out.println("Nhập số");
            number = inputNumber.nextInt();
            int count = 0;
            boolean isPrime;
            if(number < 2){
                isPrime = false;
                System.out.println(number + " không phải là số nguyên tố");
            }
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if(count == 2){
                isPrime = true;
                System.out.println(number + " là số nguyên tố");
            } else {
                isPrime = false;
                System.out.println(number + " không phải là số nguyên tố");
            }
        } while (number != -1);


    }
}
