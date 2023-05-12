public class Fruit {
    double weight;
    String type;
    String color;

    public Fruit(double weight, String type, String color) {
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    public double growth(double additionalWeight){
        this.weight += additionalWeight;
        System.out.println("Фрукт виріс на стільки ваги: " + additionalWeight);
        return this.weight;
    }
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Фрукт змінив свій колір на: " + newColor);
    }
    public void getInfo(){
        String info = "Weight: " + weight + ". Type: " + type + ". Color: " + color + "\n";
        System.out.print(info);
    }
}
