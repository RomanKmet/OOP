public class Animal {
    String type;
    String name;
    String breed;
    double weight;
    String mood;

    public Animal(String type, String name, String breed, double weight, String mood) {
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.mood = mood;
    }
    public void changeAnimalMood(String newMood) {
        this.mood = newMood;
        System.out.println("Тварина змінила свій настрій на: " + newMood);
    }

    public double eat(Fruit fruitToBeEaten) {
        this.weight += (fruitToBeEaten.weight/3);
        System.out.println("Тварина з'їла їжу і змінила свою вагу на: " + (fruitToBeEaten.weight/3));
        return this.weight;
    }

    public void getInfo() {
        String result = "";
        if (name!=null) {
            result += " Name: " + name;
        }
        String info = "Name: " + name + ". Type: " + type + ". Breed: " + breed + ". Weight: " + weight + ". Mood: " + mood + "\n";
        System.out.print(result);
    }
}
