class Calculator{
    void start(){
        System.out.println("This is start method");
    }
}

public class Icalculator extends Calculator{
    public static void main(String[] args){
        Icalculator obj = new Icalculator();
        obj.start();
        System.out.println("This is an example of abstraction");
    }
}
