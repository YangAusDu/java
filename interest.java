class interest{
    public static void main(String[] arg){
        double rate = 0.23;
        double amount;
        double principal = 1000000;

        for (int day =1; day <= 20; day++){
            amount = principal * Math.pow(rate, day);
            System.out.println(day +"  "+ amount);
        }

    }
}