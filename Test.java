import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double n1, n2;
        int select;
         Scanner input = new Scanner(System.in);
         System.out.println("Ilk sayiyi giriniz:");
         n1 = input.nextInt();
         System.out.println("Ikinci sayiyi giriniz:");
         n2 = input.nextInt();

         System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
         System.out.println("Seciminiz :");
         select = input.nextInt();

         switch (select){
             case 1:
                 System.out.println("Toplam sonucu:" + (n1+n2));
                 break;
             case 2:
                 System.out.println("Cikarma sonucu:" + (n1-n2));
                 break;
             case 3:
                 System.out.println("Carpma sonucu:" + (n1*n2));
                 break;
             case 4:
                 System.out.println("Bolme sonucu:" + (n1/n2));
                 break;
             default:
                 System.out.println("Gecersiz islem girdiniz!");
         }































    }
}
