import java.util.Scanner;

public  class Location {

    Scanner S = new Scanner(System.in);

    private String LocName;

    public void Start(){
        System.out.println("\nMacera oyununa hoş geldiniz..\n");
        System.out.println("Oyun Kuralları: \nOyunda 3 farklı mekan bir de silah ve zırh satın alabileceğiniz bir mağaza bulunmaktadır.\nBaşlangıçta seçtiğiniz karaktere göre size belli miktarda para verilmektedir. Paranızı mekanlardaki canavarları öldürürerek arttırabilir, bu sayede silah ve zırh kuşanıp farklı mekanlardaki canavarları daha rahat öldürüp eşyaları toplayarak oyunu bitirebilirsiniz.\nHer mekanda 1 ile 3 arası random sayıda gelen farklı canavarlar bulumaktadır, bu canavarlar mekana göre kolaydan zora olup giderek zorlaşmaktadır.\n\nMEKANLAR:\n \nMağara:\nCanavar: Zombi (+4 birim para) \nEşya: Yemek\n\nOrman:\n" +"Canavar : Vampir (+7 birim para)\nEşya : Odun (Firewood)\n\nNehir:\nCanavar: Ayı (+12 birim para)\nEşya: Su\n\n");
    }

    public Location(){}

    public Location(boolean baslangic)
    {
        System.out.println("\n\nOyun başlıyor...\n");
        System.out.println("Şu an güvenli evdesiniz ve canınız dolu , nereye gitmek istiyorsunuz? (Ipucu : Başlangıç için mağara iyi bir tercih olabilir :)) )");
        System.out.println("1-) Mağara");
        System.out.println("2-) Orman");
        System.out.println("3-) Nehir");
        System.out.print("Gitmek istediginiz mekanin numarasını giriniz: ");
        int x = S.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Mağaraya gidiliyor..");
                Cave C1 = new Cave();
                break;
            case 2:
                System.out.println("Ormana gidiliyor..");
                Forest F1 = new Forest();
                break;
            case 3:
                System.out.println("Nehire gidiliyor..");
                River R1 = new River();
                break;
            default:
                System.out.println("Hatalı sayı girdiniz..");


        }
    }


    public boolean onLocation()
    {
        System.out.println("");
        return true;
    }

}
