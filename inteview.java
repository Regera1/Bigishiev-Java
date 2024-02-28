import java.util.Scanner;

public class inteview 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а ");
        int a = s.nextInt();
        System.out.println("Введите число b ");
        int b = s.nextInt();
        if(a == b)
        {
            System.out.println("a = b");

        }
        if(a < b)
        {
            System.out.println("a < b");
        }
        if(a > b)
        {
            System.out.println("a > b");
        }
    }
}
