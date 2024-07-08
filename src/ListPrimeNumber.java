import java.sql.SQLOutput;
import java.util.Scanner;

public class ListPrimeNumber {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố muốn hiển thị");
        int number = inputNumber.nextInt();
        int count = 0;
        System.out.println("Danh sách " + number + " số nguyên tố");
        for(int num = 2; count < number; num++) {
            if(isPrime(num)){
                System.out.println("Số nguyên tố thứ " + (count + 1) + " là: " + num);
                count++;
            }
        }
        /*
        int num = 2; // Bắt đầu kiểm tra từ số 2

        System.out.println("Danh sách " + number + " số nguyên tố:");
        while (count < number) {
            if (isPrime(num)) {
                System.out.println("Số nguyên tố thứ " + (count + 1) + " là: " + num);
                count++; // Tăng count sau khi tìm thấy số nguyên tố
            }
            num++; // Tăng số để kiểm tra tiếp theo
        }
        */
    }
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if (count==2){
            return true;
        } else {
            return false;
        }
    }

}
