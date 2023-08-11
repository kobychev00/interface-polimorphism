public class Bicycle extends Transport implements Servicable {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre () {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку велосипеда");
        }
    }

    @Override
    public void doService() {
        updateTyre();
    }
}
