public class Car extends Transport{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine () {
        System.out.println("Проверяем двигатель машины");
    }

}
