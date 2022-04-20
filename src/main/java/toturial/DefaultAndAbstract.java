package toturial;

interface say{
//default mthod
    default void say3(){
        System.out.println("I am default method");
    }
    //abstract mthod
    void say1(String s);

    static void say2(String s1){
        System.out.println(s1);
    }

}

public class DefaultAndAbstract implements say {

    @Override
    public void say1(String s) {
        System.out.println(s);

    }


    public static void main(String[] args) {
        DefaultAndAbstract dm=new DefaultAndAbstract();
        dm.say1("yes");
        dm.say3();
        say.say2("no");
    }
}
