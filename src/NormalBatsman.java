public class NormalBatsman implements Player{
    String name;
    PlayerType type = PlayerType.Batsman;

    public NormalBatsman(String name)
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
