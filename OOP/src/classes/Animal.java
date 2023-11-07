package classes;

class Animal {
    private String type, name, breed, mood;
    private double weight;
    private int height;

    Animal(String type, String name, String breed, double weight, String mood, int height) {
        this.height = height;
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.mood = mood;
    }
    Animal(String type, String name, String breed, int weight, String mood, double height) {
        this.height = (int) height;
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.mood = mood;
    }
    int growth(int additional){
        this.height+=additional;
        System.out.println("Кіт змінив свій зріст на "+ additional+" см.");
        return height;
    }
    void changeAnimalMood(String newMood) {
        this.mood = newMood;
        System.out.println("Тварина змінила свій настрій на: " + newMood);
    }

    double eat(Fruit fruitToBeEaten) {
        this.weight += (fruitToBeEaten.getWeight()/3);
        System.out.format("Тварина з'їла їжу і змінила свою вагу на: %.2f. \n", (fruitToBeEaten.getWeight()/3));
        System.out.format("Тепер вага тварини %.2f. \n", this.weight);
        return this.weight;
    }

    void getInfo() {
        String info = "Name: " + name + ". Type: " + type + ". Breed: " + breed + ". Weight: " + weight + ". Mood: " + mood + "\n";
        System.out.print(info);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getMood() {
        return mood;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
