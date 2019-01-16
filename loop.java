import java.util.Scanner;


class loop{
    public static void main(String[] arg) {
        loop_while();
        loop_for();
    }
    

    public static void loop_while(){
        int n = 0;
        while(n++ < 10){
            System.out.println("number"+n);

        }
    }

    public static void loop_for(){
        int n;
        for(n = 0; n<10; n++){
            System.out.println("number"+n);

        }
    }
}