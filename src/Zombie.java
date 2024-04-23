import java.util.Random;
import java.util.Scanner;

public class Zombie implements Obstacle
{
     static int ID = 1;
     static int Damage = 3;
     static int Healty = 10;
     static int Money  = 4;

     public Zombie()
     {
         int sayi = ObstacleNum();
         Player pl1 = new Player();
         System.out.println("");
         System.out.println(sayi + " sayida zombi geldi Zombilerin tek vuruşu 3 can götürür , Zombilerin sağlığı ise 10'dur. Öldürdüğünüz zombi başına 4 birim para kazanacaksınız. Savaşmak istiyor musunuz? ");
         System.out.println("Savasmak için S , Kacmak icin K basınız.");
         Scanner scan = new Scanner(System.in);
         String a = scan.nextLine();

         switch (a)
         {
             case "S":
                 for(int i=sayi; i<0;i--)
                 {
                     System.out.println("ZOMBİLERLE SAVASILIYOR!! ");
                     System.out.println("Sizin canınız: " + pl1.getHealthy());
                     System.out.println("Zombi canı: " + Zombie.Healty);
                 }

         }

     }

    public int ObstacleNum()
    {
        Random num = new Random();
        int randomNumber = num.nextInt(3)+1;
        return randomNumber;
    }


}
