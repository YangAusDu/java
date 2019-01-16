class static1{
    private String first;
    private String last;
    private static int members = 0;   /* without static the memeber would be reset back to 0 on each run*/

    public static1(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructors for %s %s, members in the club: %d\n ", first, last,members);

    }

    public String getFirstname(){
        return first;
    }

    public String getLastname(){
        return last;
    }

    public static int getMembers(){
        return members;
    }

    
}

class static2{
    public static void main(String[] arg){
        static1 member1 = new static1("Tom","Holland");
        static1 member2 = new static1("Natalie","Portman");
        static1 member3 = new static1("Tony","Stark");

        System.out.println();
        System.out.println(member1.getFirstname());
        System.out.println(member1.getLastname());
        System.out.println(member1.getMembers());

    }
}