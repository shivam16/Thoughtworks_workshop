public class HitterBatsman implements Player
{
    String name;
    PlayerType type = PlayerType.Hitter;

    public HitterBatsman(String name)
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
        int[] runsSet = new int[]{0, 4, 6};
        return runsSet[GameUtils.getRandomNumber() % 3];
    }
}
