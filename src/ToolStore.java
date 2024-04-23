import java.util.Scanner;

public class ToolStore extends NormalLoc{

    public void Menu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ToolStore Hoş geldiniz..");
        System.out.println("Silahlar için 1'i , Zırhlar için 2'yi seçiniz.");
        int choose = scan.nextInt();

        if(choose == 1)
        {
            System.out.println("Tabanca +2 Damage verir, ücreti 25 birim paradır.");
            System.out.println("Kılıç +3 Damage verir, ücreti 35 birim paradır.");
            System.out.println("Tüfek +7 Damage verir, ücreti 45 birim paradır.");
        }

        else if(choose == 2)
        {
            System.out.println("Hafif Zırh +1 Engelleme sağlar, ücreti 15 birim paradır.");
            System.out.println("Orta Zırh +3 Engelleme sağlar, ücreti 25 birim paradır.");
            System.out.println("Ağır Zırh +5 Engelleme sağlar, ücreti 40 birim paradır.");

        }

    }

}
