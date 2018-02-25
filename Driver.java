/**
 * Basic class description goes here
 * @author <Name of code autho>
 * @version <version can be numericalor the date of latest update>
 */
public class Driver {
    private int age ;
    private String name;
    public Driver(){
        java.util.Scanner kbd = new java.util.Scanner(System.in);
        System.out.println("Enter your age: ");
        age=kbd.nextInt();
        kbd.nextLine();
        System.out.println("Enter your name: ");
        name = kbd.nextLine();
        if(age>20)
            System.out.println("You are too old");
        else
            System.out.println("You are too young");
        kbd.close();
    }

    public int getAge(){
        return age+10;
    }

    public String getName(){
        return name;   
    }
}
