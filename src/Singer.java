public class Singer extends Person {
    public Singer() {
    }
    public Singer(String name, String designation) {
        super(name, designation);
    }
    private String groupName;

    public String  learn(String learn){
        return learn;

    }public String walk(String walk){
        return walk;
    }
    public String eat(String eat){
        return eat;
    }
    public String singing(String singing){
        return singing;
    }
    public String playGitar(String playGitar){
        return playGitar;
    }

    public Singer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Singer{" +"name: "+getName() +"designation : "+getDesignation()+
                "| groupName='" + groupName + '\'' +
                '}'+"singing: "+singing("singing  | ")+"plays? : "+playGitar("playGitar| ");
    }
}

