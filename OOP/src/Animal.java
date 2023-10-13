public class Animal {
    String type, name, breed, mood;
    double weight;
    int height;

    public Animal(String type, String name, String breed, double weight, String mood, int height) {
        this.height = height;
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.mood = mood;
    }
    public Animal(String type, String name, String breed, int weight, String mood, double height) {
        this.height = (int) height;
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.mood = mood;
    }
    public int growth(int additional){
        this.height+=additional;
        System.out.println("Кіт змінив свій зріст на "+ additional+" см.");
        return height;
    }
    public void changeAnimalMood(String newMood) {
        this.mood = newMood;
        System.out.println("Тварина змінила свій настрій на: " + newMood);
    }

    public double eat(Fruit fruitToBeEaten) {
        this.weight += (fruitToBeEaten.weight/3);
        System.out.format("Тварина з'їла їжу і змінила свою вагу на: %.2f. \n", (fruitToBeEaten.weight/3));
        System.out.format("Тепер вага тварини %.2f. \n", this.weight);
        return this.weight;
    }

    public void getInfo() {
        String info = "Name: " + name + ". Type: " + type + ". Breed: " + breed + ". Weight: " + weight + ". Mood: " + mood + "\n";
        System.out.print(info);
    }
}
