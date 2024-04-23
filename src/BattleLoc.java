import java.util.Random;

public class BattleLoc extends Location implements Obstacle{

    @Override
    public int ObstacleNum()
    {
        Random num = new Random();
        int randomNumber = num.nextInt(3)+1;
        return randomNumber;
    }

    public BattleLoc(){}

    public BattleLoc(Obstacle o)
    {

    }


}
