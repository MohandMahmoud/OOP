import java.util.Scanner;
class  test_App
{
    public int add(int x, int y)
    {
        return x+y;
    }

}
public class main {
    Scanner s1=new Scanner(System.in);
    char x = s1.next().charAt(0);
    final static int i=2;
    public static void main(String args[])
    {
        Person A=new Person("Bob",25);
        System.out.println(A.getName());
        change(A);
        System.out.println(A.getName());

    }
    public static void change(Person B)
    {
        B.setName("jim");
        B.setAge(20);

    }
}


