
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
     public static void main(String[] args) {
        Number num1 = new Number(3);
        Number num2 = new Number(2);
        String name = new String("Jack");
        changeIt(num1, num2, name);
        
        System.out.println("Number 1: " + num1.getValue());
        System.out.println("Number 2: " + num2.getValue());
        System.out.println("Name: " + name);
    }
    
    public static void changeIt(Number n1, Number n2, String s) {
        n1.setValue(6);
        Number n3 = new Number(1);
        n2 = n3;
        n2.setValue(4);
        s = new String("Jill");
    }
}
