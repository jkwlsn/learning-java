interface Animal {
    public void noise();
    public void move();
}

interface Pet {
    public void owned();
    public void address();
}

class Cat implements Animal, Pet {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void noise() {
        System.out.println(this.name + " miaows");
    }

    public void move() {
        System.out.println(this.name + " slinks");
    }

    public void owned() {
        System.out.println(this.name + " is owned by Jake");
    }

    public void address() {
        System.out.println(this.name + " lives in Jake's house");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat shanie = new Cat("Shanie");
        shanie.noise();
        shanie.move();
        shanie.owned();
        shanie.address();
    }
}
