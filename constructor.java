class constructor1{
    private String product;

    public constructor1(String name){
        product = name ;
    }

    public void set_name(String name){
        product = name;
    }

    public String return_product(){
        return product;
    }

    public void print_product(){
        System.out.println(product);
    }
}