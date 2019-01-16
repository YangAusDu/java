import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class mood_1 {
    private Date date;

    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(date);
    }
    public void setDate(Date new_date){
        date = new_date;
    }   
}

class mood_2 extends mood_1{
    mood_2(){
        Date current_date = new Date();
        super.setDate(current_date);

    }
    mood_2(String new_date) throws Exception{
        Date set_date = new SimpleDateFormat("yyyy/MM/dd").parse(new_date);
        super.setDate(set_date);
    }

    public void type(){
        String date = super.getDate();
        System.out.println("current day is: "+ date+" I am very sad");
    }
}    

class mood_3 extends mood_1{
    mood_3(){
        Date current_date = new Date();
        super.setDate(current_date);

    }
    mood_3(String new_date) throws Exception{
        Date set_date = new SimpleDateFormat("yyyy/MM/dd").parse(new_date);
        super.setDate(set_date);
    }

    public void type(){
        String date = super.getDate();
        System.out.println("current day is: "+ date+" I am very Happy");

    }
}    

class mood_4{
    public static void main(String arg[])throws Exception{
        mood_2 obj_1 = new mood_2();
        mood_2 obj_2 = new mood_2("1980/10/07");
        mood_3 obj_3 = new mood_3();
        mood_3 obj_4 = new mood_3("1980/10/07");
        obj_1.type();
        obj_2.type();
        obj_3.type();
        obj_4.type();
    }
}
