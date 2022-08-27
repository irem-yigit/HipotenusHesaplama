import java.util.Scanner;

    public class miniproje4 {
        public static void main(String[] Args){
            //Dik üçgenin hipotenüsünü bulma   h= karekök içinde a*a + b*b
            Scanner scan = new Scanner(System.in);

            int a,b;
            System.out.print("Birinci kenar: ");
            a=scan.nextInt();

            System.out.print("İkinci kenar: ");
            b = scan.nextInt();

            double h = Math.sqrt(a*a + b*b);  //Math.sqrt --> karekök alma fonksiyonu

            System.out.println("Hipotenüs: "+ h + " dir.");
        }
    }

