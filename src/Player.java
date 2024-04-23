import java.util.Scanner;

public class Player extends Inventory {
    public Player() {}

    private int damage;
    private int healthy;
    private int money;
    private String PlayerName;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    Player(boolean a) {
        System.out.println("1-) Samuray ** Hasar = 5 ** Sağlık = 21 ** Para = 15");
        System.out.println("2-) Okçu    ** Hasar = 7 ** Sağlık = 18 ** Para = 20");
        System.out.println("3-) Şovalye ** Hasar = 8 ** Sağlık = 24 ** Para = 20");
        System.out.println("");
        System.out.println("//****************//");
        System.out.println("Karakter Seçiniz...");


            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Karakteriniz Samuray olarak seçildi.");
                    this.damage = 5;
                    this.healthy = 21;
                    this.money = 15;
                    // Inventory O1 = new Inventory(false, false, false, null, null, 0, 0);
                    break;
                case 2:
                    System.out.println("Karakteriniz Okçu olarak seçildi.");
                    this.damage = 7;
                    this.healthy = 18;
                    this.money = 20;
                    break;
                //Inventory O1 = new Inventory(false, false, false, null, null, 0, 0);
                case 3:
                    System.out.println("Karakteriniz Şovalye olarak seçildi.");
                    this.damage = 8;
                    this.healthy = 24;
                    this.money = 5;
                    break;
                //Inventory O1 = new Inventory(false, false, false, null, null, 0, 0);
                default:
                    System.out.println("Hatalı giriş yaptınız.. Tekrar giriniz.");
            }

        }

    public String getPlayerName() {
        return PlayerName;
    }

}
