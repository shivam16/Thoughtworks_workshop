import java.util.Random;

public class GameUtils
{
    public static int getRandomNumber()
    {
        Random rnd = new Random();
        return rnd.nextInt(10);
    }
}
