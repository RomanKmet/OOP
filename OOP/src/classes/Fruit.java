package classes;

class Fruit {
    private double weight;
    private String type, color;
    Fruit(double weight, String type, String color) {
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    Fruit(int weight, String type, String color) {
        this.weight = weight;
        this.type = type;
        this.color = color;
    }
    Fruit growth(Fruit choosenFruit, double additionalWeight){
        choosenFruit.weight += additionalWeight;
        System.out.println("Фрукт виріс на стільки ваги: " + choosenFruit.weight);
        return choosenFruit;
    }
    int growth(int additional){
        this.weight += additional;
        System.out.println("Фрукт виріс на стільки ваги: " + additional);
        return (int) this.weight;
    }
    int recursive(int Postavok, int OdnaPostavka, int resultPostavok){
        resultPostavok+=OdnaPostavka;
        if (Postavok==1){
            System.out.println("Для заданої кількості поставок потрібно стільки фруктів "+resultPostavok);
            return resultPostavok;
        }
        return recursive(Postavok-1, OdnaPostavka, resultPostavok);
    }
    void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Фрукт змінив свій колір на: " + newColor);
    }

    void getInfo(){
        String info = "Weight: " + weight + ". Type: " + type + ". Color: " + color + "\n";
        System.out.print(info);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
