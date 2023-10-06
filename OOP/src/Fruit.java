public class Fruit {
    double weight;
    String type;
    String color;
    public Fruit(double weight, String type, String color) {
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    public Fruit growth(Fruit choosenFruit, double additionalWeight){
        choosenFruit.weight += additionalWeight;
        System.out.println("Фрукт виріс на стільки ваги: " + choosenFruit.weight);
        return choosenFruit;
    }
    public int growth(int additionalWeight){
        this.weight += additionalWeight;
        System.out.println("Фрукт виріс на стільки ваги: " + additionalWeight);
        return (int) this.weight;
    }
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Фрукт змінив свій колір на: " + newColor);
    }
    public int recursive(int Postavok, int OdnaPostavka, int resultPostavok){
        resultPostavok+=OdnaPostavka;
        if (Postavok==1){
            System.out.println("Для заданої кількості поставок потрібно стільки фруктів "+resultPostavok);
            return resultPostavok;
        }
        return recursive(Postavok-1, OdnaPostavka, resultPostavok);
    }
    public void getInfo(){
        String info = "Weight: " + weight + ". Type: " + type + ". Color: " + color + "\n";
        System.out.print(info);
    }
}
