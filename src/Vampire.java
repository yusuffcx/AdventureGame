import java.util.Random;

public class Vampire implements Obstacle
{
     int ID = 2;
     int Damage = 4;
     int Healty = 14;
     int Money = 7;

     public Vampire()
     {

     }


    public int ObstacleNum()
    {
        Random num = new Random();
        int randomNumber = num.nextInt(3)+1;
        return randomNumber;
    }



}
