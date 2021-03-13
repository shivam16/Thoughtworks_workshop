public class Bowler implements Player
{
    String name;
    PlayerType type = PlayerType.Bowler;

    public Bowler(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PlayerType getType() {
        return type;
    }

    @Override
    public int score() {
        return GameUtils.getRandomNumber();
    }
}
