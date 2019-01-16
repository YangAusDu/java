import java.util.Scanner;
import java.util.Random;

class number{
    public void function_1() {
        System.out.print("Please enter the first number: ");
        Scanner first_input = new Scanner(System.in);
        double first_number;
        first_number = first_input.nextDouble();

        System.out.print("Please enter the first number: ");
        Scanner second_input = new Scanner(System.in);
        double second_number; 
        second_number = second_input.nextDouble();

        double sum, product;

        sum = first_number + second_number;
        product = first_number * second_number;
        System.out.print("the sum of these two number is: ");
        System.out.println(sum);
        if (sum % 2 == 0){
            System.out.println("the sum is a even numebr \n");
        }
        else{
            System.out.println("the sum is an odd numebr \n");
        }


        System.out.print("\nthe product of these two number is: ");
        System.out.println(product);
        if (product % 2 == 0){
            System.out.println("the product is a even numebr \n");
        }
        else{
            System.out.println("the product is an odd numebr \n");
        }
/*   && == and           || == or */
        while (first_number < product){
            System.out.println(++first_number);
        }
    }
    public void function_2(String name){    /* a string parameter called arg */
        System.out.println("this is funciton 2");
        System.out.println("your name is: "+name);

    }
    
}