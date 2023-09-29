public class Main {
    public static void main(String[] args) {
        Fruit choosenFruit = new Fruit(0.5,"Blueberry","Blue");
        Animal choosenAnimal = new Animal("Cat","Meowchik","Scottish fold", 4.7, "Сумний");
        Car choosenCar = new Car("Ferrari", 1230, "Premium", 19.6);

        choosenFruit.getInfo();
        choosenFruit.growth(0.3);
        choosenFruit.changeColor("Червоний");
        choosenFruit.getInfo();

        System.out.println();

        choosenAnimal.getInfo();
        choosenAnimal.changeAnimalMood("Веселий");
        choosenAnimal.eat(choosenFruit);
        System.out.println("Тепер вага тварини: " + choosenAnimal.weight);
        choosenAnimal.getInfo();

        System.out.println();

        choosenCar.getInfo();
        choosenCar.trunk("Medkit","Water","Food");
        choosenCar.openTrunk();
    }
}
