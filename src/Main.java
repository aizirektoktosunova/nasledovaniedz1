public class Main {
    public static void main(String[] args) {
Person person=new Person("Person","aaaaa");
        System.out.println(person   +"walk: "+person.walk("school | ")+"learn: "+person.learn("will learn to walk  |  ")
        +"eat: "+person.eat("fruits, vegetables...."));
        System.out.println();
 Singer singer=new Singer("Artur |","ssss","Luxor")  ;
        System.out.println(singer+"walk:  "+singer.walk("studio|  ")+"learn: "+singer.learn("learn to sing|  ")+
                "eat: "+singer.eat("diet foods"));
        System.out.println();
        Dancer dancer=new Dancer("Aizi| ","hhhh |","etnos");
        System.out.println(dancer);
        System.out.println();
        Programmer programmer=new Programmer("Aizirek | ","dddd | ","Paeksoft");
        System.out.println(programmer);
    }

}