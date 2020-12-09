public class Car {
    private String color;
    private String engine;
    private String modelName;
    private int dors;
    private int wheels;

    public int getWheels() { return wheels; }

    public void setWheels(int wheels) { this.wheels = wheels; }

    public int getDors() { return dors; }

    public void setDors(int dors) { this.dors = dors; }

    public String getModelName() { return modelName; }

    public void setModelName(String modelName) { this.modelName = modelName; }

    public String getEngine() { return engine; }

    public void setEngine(String engine) { this.engine = engine; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public void setModel(String modelName){ this.modelName = modelName; }

    public String getModel(){ return this.modelName; }

}

 class MainCar{
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Metalik");
        car.setEngine("V6");
        car.setDors(2);
        car.setWheels(4);
        car.setModel("1981 Delorean DMC-12");
        System.out.println("Arabanın özelikleri : " + car.getColor() + " renk\t" +  car.getModel() + " model\t" +  car.getEngine() + " motor\t" +  car.getDors() + " kapılı\t" +  car.getWheels() + " tekerlekli\t");

    }
}
