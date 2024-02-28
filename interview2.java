// 2. Написать программу,которая принимает на вход две строки(a и b)и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений:"Строки неидентичны"или"Строки идентичны"

import java.util.Scanner;

public class interview2 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку ");
        String a = s.nextLine();
        System.out.println("Введите вторую строку ");
        String b = s.nextLine();

        if(a.equals(b))
    {
        System.out.println("Строки идентичны");
        
    }
    else
    {
        System.out.println("Строки неидентичны");
        
    }
    
    s.close();

    }
    
}
