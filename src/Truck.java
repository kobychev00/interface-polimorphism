public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }
    @Override
    public void checkEngine () {
        System.out.println("Проверяем двигатель машины");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}