class inheritance_apple{
    public static void main(String[] arg){
        inheritance_tuna tuna_obj = new inheritance_tuna();
        inheritance_orange orange_obj = new inheritance_orange();

        tuna_obj.eat();
        orange_obj.eat();

    }
    

}

class inheritance_tuna extends inheritance_food{
    public void eat(){
        System.out.println("i am the tuna eat method");

    }

}

class inheritance_orange extends inheritance_food{

}

class inheritance_food{
    public void eat(){
        System.out.println("i am the eat method");
    }
}

/* if tuna also has a function named eat(), the inheritance food.eat() won't be executed.*/