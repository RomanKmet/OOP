public class Car {
    String modelName;
    int mileage;
    String gasType;
    double amountOfGas;
    String[] storage;

    public Car(String modelName, int mileage, String gasType, double amountOfGas) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.gasType = gasType;
        this.amountOfGas = amountOfGas;
        storage = new String[10];
    }

    public void trunk(String... items) {
        int i = 0;
        for (String item : items) {
            this.storage[i] = item;
            i++;
        }
    }

    public void openTrunk() {
        for (int h = 0; h < this.storage.length;  h++) {
            if(this.storage[h]==null){
                System.out.println("Місце " + (h + 1) + " в багажнику пусто");
            }else {
                System.out.println("Місце " + (h + 1) + " в багажнику містить: " + this.storage[h]);
            }
        }
    }

        public void getInfo () {
            String info = "Model: " + modelName + ". Mileage: " + mileage + ". Gas type: " + gasType + ". Amount of gas: " + amountOfGas + "\n";
            System.out.print(info);
        }
    }
