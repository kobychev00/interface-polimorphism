public class Car extends Transport implements Servicable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }


    @Override
    public void doService() {
        updateTyre();
        checkEngine();
    }
}
