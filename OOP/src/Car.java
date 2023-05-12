public class Car {
    String modelname;
    int mileage;
    String gastype;
    double amountofgas;
    String[] storage;

    public Car(String modelname, int mileage, String gastype, double amountgas) {
        this.modelname = modelname;
        this.mileage = mileage;
        this.gastype = gastype;
        this.amountofgas = amountgas;
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
            String info = "Model: " + modelname + ". Mileage: " + mileage + ". Gas type: " + gastype + ". Amount of gas: " + amountofgas + "\n";
            System.out.print(info);
        }
    }
