package repetition.inheritance;

import java.util.Scanner;

public class Inheritance {
    public static class Vehicle {
        private int tires;
        private String color;

        public int getTires() {
            return tires;
        }

        public void setTires(int tires) {
            this.tires = tires;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Vehicle(int tires, String color) {
            this.tires = tires;
            this.color = color;
        }

        @Override
        public String toString() {
            return
                    "Tires: " + tires +
                    ", Color: " + color;
        }

    }

    public static class Car extends Vehicle {
        private int speed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public Car(int tires, String color, int speed) {
            super(tires, color);
            this.speed = speed;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Speed: " + speed;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tires = scanner.nextInt();
        String color = scanner.next();
        int speed = scanner.nextInt();
        Car car = new Car(tires, color, speed);
        scanner.close();
        System.out.println(car);
    }
}
