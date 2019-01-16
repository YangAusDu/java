import java.util.Scanner;


class multi_class{
    public static void main(String[] arg) {
        number number_object = new number();
        number_object.function_1();
        System.out.print("please enter your name");
        Scanner name_input = new Scanner(System.in);
        String name = name_input.next();
        number_object.function_2(name);  /* what's in the function's bracket must be in consistensy with funcition's def */
    }
}