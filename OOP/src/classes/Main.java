package classes;

 class Main {
    static void main(String[] args) {
        Fruit choosenFruit = new Fruit(0.5,"Blueberry","Blue");
        Animal choosenAnimal = new Animal("Cat","Meowchik","Scottish fold", 4.7, "Сумний", 7);
        Car choosenCar = new Car("Ferrari", 1230, "Premium", 19.6);
        MathFinal mathObj = new MathFinal();

        choosenFruit.getInfo();
        choosenFruit.growth(1);
        choosenFruit.changeColor("Червоний");
        choosenFruit.getInfo();
        choosenFruit.growth(choosenFruit, 0.5);
        choosenFruit.recursive(5,10,0);
        choosenFruit.getInfo();

        System.out.println();

        choosenAnimal.getInfo();
        choosenAnimal.changeAnimalMood("Веселий");
        choosenAnimal.eat(choosenFruit);
        choosenAnimal.growth(2);
        choosenAnimal.getInfo();

        System.out.println();

        choosenCar.getInfo();
        choosenCar.trunk("Medkit","Water","Food");
        choosenCar.openTrunk();

        System.out.println();

        double circleArea = mathObj.circleArea(5.0);
        System.out.println("Площа кола: " + circleArea);
        double rectangleArea = mathObj.areaOfRectangle(4.0, 6.0);
        System.out.println("Площа прямокутника: " + rectangleArea);
        double squareArea = mathObj.areaOfSquare(4.0);
        System.out.println("Площа квадрата: " + squareArea);

        System.out.println();

        double resultBuy = MathStatic.buyProduct(20);
        System.out.println("Результат купівлі: " + resultBuy);
    }
}
