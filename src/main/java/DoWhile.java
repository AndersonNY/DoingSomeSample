import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number= 0;
        do {

            System.out.println("enter a number");

            number = input.nextInt();
        }

        while (number !=9);

        System.out.println("You got 9!");
    }
}


//    public boolean nearHundred(int n) {
//
//        return ((Math.abs(100-n) <=10) ||
//
//                (Math.abs(200-n)<=10));
//
//
//    }