public class Game
{
    int target;
    int overs;
    int totalRuns;

    Player batsman = new DefensiveBatsman("Kohli");
    Player bowler = new Bowler("Ashwin");

    public Game(int target, int overs)
    {
        this.target = target;
        this.overs = overs;
    }

    public String play()
    {
        for(int i = 0; i < (overs * 6); i++)
        {
            int batsManRuns = batsman.score();
            int bowlerRuns = bowler.score();

            System.out.println(batsman.getName() + " scored: " + batsManRuns);
            System.out.println(bowler.getName() + " scored: " + bowlerRuns);

            if(batsManRuns == bowlerRuns)
            {
                return bowler.getName();
            }

            totalRuns += batsManRuns;

            if(totalRuns >= target)
            {
                return batsman.getName();
            }
        }
        return bowler.getName();

    }

}
