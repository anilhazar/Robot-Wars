public class Robot_B extends Robots {
    private int weight = 15;
    private double rapidity = 4.8;

    public String name;

    public Robot_B(int weight, double rapidity){
        this.weight = weight;
        this.rapidity=rapidity;
        name = "Robot B";
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public double getRapidity() {
        return rapidity;
    }

    public String getName(){
        return name;
    }
}
