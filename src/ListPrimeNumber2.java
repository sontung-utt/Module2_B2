import java.util.Scanner;

public class ListPrimeNumber2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số");
        int n = inputNumber.nextInt();
        System.out.println("Danh sách số nguyên tố < " + n);
        for (int numberPrime = 2; numberPrime < n; numberPrime++) {
            if(isPrime(numberPrime)) {
                System.out.println(numberPrime);
            }
        }

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
