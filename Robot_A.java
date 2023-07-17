public class Robot_A extends Robots {
   private int weight;
   private double rapidity;

   public String name;

   public Robot_A(int weight, double rapidity){
       this.weight = weight;
       this.rapidity=rapidity;
       name = "Robot A";
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
