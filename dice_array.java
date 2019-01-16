import java.util.Random;;

class dice_array{
    public static void main(String[] arg){
        Random dice = new Random();
        int num;
        for (int count = 0; count < 10; count++){
            num = dice.nextInt(10);
            System.out.println(num);
        }
        String array[] = {"first","second"};
        System.out.print(array[0]+"\t"+array[1]);


    }
}