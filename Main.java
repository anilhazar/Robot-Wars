public class Main {
    public static void main(String[] args) {
        Robots a = new Robot_A(10, 5);
        Robots b = new Robot_B(10, 7);

        Robots[] robots = new Robots[]{a, b};

        ScoreCalculator scoreA = new ScoreCalculator(a, a.getWeight(), a.getRapidity());
        ScoreCalculator scoreB = new ScoreCalculator(b, b.getWeight(), b.getRapidity());

        WinnerRobot winner = new WinnerRobot(robots);

        System.out.println("The Winner is " + winner.getWinner() + " !!!");


    }
}