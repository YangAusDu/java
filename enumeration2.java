import java.util.EnumSet;

class enumeration2{
    public static void main(String[] arg){
        for(enumeration_1 people: enumeration_1.values()){
            System.out.printf("%s\t%s\t%s\n",people, people.getDesc(),people.getYear());
        }

        System.out.println(enumeration_1.bucky.getDesc());
        System.out.println(enumeration_1.julia.getYear());

        System.out.print("\n And now for the range of constant \n");

        for (enumeration_1 people:EnumSet.range(enumeration_1.kelsey, enumeration_1.candy)){
            System.out.printf("%s\t%s\t%s\n",people, people.getDesc(),people.getYear());
        }



    }
}