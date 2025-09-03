import java.util.Scanner;

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
    short age;

    public Cat(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public void age() {
        System.out.println(this.name + " is " + this.age + " years old");
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
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cat name: ");
        String catName = input.nextLine();
        System.out.print("Enter cat age: ");
        short catAge = input.nextShort();

        Cat myCat = new Cat(catName, catAge);
        myCat.age();
        myCat.noise();
        myCat.move();
        myCat.owned();
        myCat.address();
    }
}
