import java.util.Scanner ;

public class PrimeRecursive {

    static boolean isPrime(int number, int i) {

        if (i == (number / 2) + 1 ) {
            System.out.println(number + " is a prime number !");
            return true ;
        }

       if ( number % i == 0) {
           System.out.println(number + " is NOT a prime number !");
           return false ;

       }
       i++ ;
       return isPrime(number, i);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 2 ;
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println(isPrime(number, i));

    }
}
