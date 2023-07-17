public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }
    public String  learn(String learn){
        return learn;

    }public String walk(String walk){
        return walk;
    }
    public String eat(String eat){
        return eat;
    }
    public String dancing(String dancing){
        return dancing;
    }
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;

    }

    @Override
    public String toString() {
        return "Dancer{" +"name: "+getName()+"designation: "+getDesignation()+"dancing: "+dancing("dancing")+
                "| groupName='" + groupName + '\'' +
                '}'+"walk :"+walk("studio| ")+"eat: "+eat("dietfoods  | ")+"learn: "+learn("learn to dance ");
    }
}