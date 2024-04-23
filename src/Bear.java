import java.util.Random;

public class Bear implements Obstacle
{
     int ID = 3;
     int Damage = 7;
     int Healty = 20;
     int Money = 12;

     public Bear()
     {

     }

    public int ObstacleNum()
    {
        Random num = new Random();
        int randomNumber = num.nextInt(3)+1;
        return randomNumber;
    }
}
