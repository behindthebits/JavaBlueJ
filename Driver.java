/**
 * Basic class description goes here
 * @author <Name of code autho>
 * @version <version can be numericalor the date of latest update>
 */
public class Driver {
    private int age ;
    public Driver(){
        System.out.println("Hello World");
        java.util.Scanner kbd = new java.util.Scanner(System.in);
        age=kbd.nextInt();
        if(age>20)
            System.out.println("You are too old");
        else
            System.out.println("You are too young");
        kbd.close();
    }
    public int getAge(){
        return age+10;
    }
}
