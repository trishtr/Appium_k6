package lesson9;

public class Animal {
    private String animalName;
    private int speed;
    private boolean flyable;


    private Animal(){
    }

    protected Animal(Builder builder) {
        animalName = builder.animalName;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    //read only

    public String getAnimalName() {
        return animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean flyable(){
        return flyable;
    }


    public static class Builder {
        private String animalName;
        private int speed;
        private boolean flyable;

        public Builder withanimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }

        public Builder withspeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder withFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }


        public void isFlyable() {
            if (this.animalName == null || this.flyable) {
                throw new IllegalArgumentException("This animal can fly");
            }
        }

        public Animal build() {
            isFlyable();
            return new Animal(this);
        }
    }
        



}
