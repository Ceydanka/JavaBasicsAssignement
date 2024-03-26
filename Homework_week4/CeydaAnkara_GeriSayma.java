import javax.swing.*;
import java.util.Scanner;
public class fordongusu {
    public static void main (String args[]){
        Scanner a= new Scanner(System.in);
        int sayi= a.nextInt();
        if(sayi>100){
            for ( int b=sayi;b>0;b--){
                System.out.println(b);

            }}
            else
            {
                System.out.println("hatali giris 100'den buyuk sayi gir");
                int sayi2=a.nextInt();
                for (int c=sayi2;c>0;c--){
                    System.out.println(c);
                }

            }
    }
}
//CEYDA ANKARA

