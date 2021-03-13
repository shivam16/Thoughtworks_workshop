public class BookCricket
{
    public static void main(String[] args)
    {
        Game cricketGame = new Game(20, 2);
        String winner = cricketGame.play();
        System.out.println(winner + " wins");
    }
}
