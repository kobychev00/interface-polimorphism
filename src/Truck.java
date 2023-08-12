public class Truck extends Car implements Servicable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void updateTyre () {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку грузовика");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void doService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}