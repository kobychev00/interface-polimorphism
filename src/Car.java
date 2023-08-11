public class Car extends Transport implements Servicable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre () {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку автомобиля");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }


    @Override
    public void doService() {
        updateTyre();
        checkEngine();
    }
}
