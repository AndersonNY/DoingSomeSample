import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {

//        Scanner input= new Scanner(System.in);
//
//        System.out.println("Enter a text line: ");
//
//        String text= input.nextLine();
//
//        System.out.println("your line is: "+ text);
//

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int aValue= input.nextInt();

        System.out.println("Your number is : " +aValue);


    }


}
