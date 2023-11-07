package classes;

public class Car {
    private String modelName, gasType;
    private int mileage;
    private double amountOfGas;
    private String[] storage;

    Car(String modelName, int mileage, String gasType, double amountOfGas) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.gasType = gasType;
        this.amountOfGas = amountOfGas;
        storage = new String[10];
    }
    Car(String modelName, double mileage, String gasType, int amountOfGas) {
        this.modelName = modelName;
        this.mileage = (int) mileage;
        this.gasType = gasType;
        this.amountOfGas = amountOfGas;
        storage = new String[10];
    }

    void trunk(String... items) {
        int i = 0;
        for (String item : items) {
            this.storage[i] = item;
            i++;
        }
    }

    void openTrunk() {
        for (int h = 0; h < this.storage.length;  h++) {
            if(this.storage[h]==null){
                System.out.println("Місце " + (h + 1) + " в багажнику пусто");
            }else {
                System.out.println("Місце " + (h + 1) + " в багажнику містить: " + this.storage[h]);
            }
        }
    }

        void getInfo () {
            String info = "Model: " + modelName + ". Mileage: " + mileage + ". Gas type: " + gasType + ". Amount of gas: " + amountOfGas + "\n";
            System.out.print(info);
        }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setAmountOfGas(double amountOfGas) {
        this.amountOfGas = amountOfGas;
    }

    public void setStorage(String[] storage) {
        this.storage = storage;
    }

    public String getModelName() {
        return modelName;
    }

    public String getGasType() {
        return gasType;
    }

    public int getMileage() {
        return mileage;
    }

    public double getAmountOfGas() {
        return amountOfGas;
    }

    public String[] getStorage() {
        return storage;
    }
}
