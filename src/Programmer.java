public class Programmer extends Person {
   String companyName;

    public Programmer(String companyName) {
        this.companyName = companyName;
    }
    public String  learn(String learn){
        return learn;

    }public String walk(String walk){
        return walk;
    }
    public String eat(String eat){
        return eat;
    }
    public String coding(String coding){
        return coding;
    }
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +"name: "+getName()+"designation: "+getDesignation()+
                "companyName='| " + companyName + '\'' +
                '}'+"coding: "+coding("coding | "+"eat: "+eat("diet foods | ")+"walk: "+walk("company| ")+"learn:"+learn("coding"));
    }
}