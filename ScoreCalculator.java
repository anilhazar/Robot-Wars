public class ScoreCalculator {
    Robots robotType;

    public ScoreCalculator(Robots robotType, int weight, double height ) {
        this.robotType = robotType;
        robotType.score = weight * height;
    }

}
