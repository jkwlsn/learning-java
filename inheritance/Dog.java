public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void noise() {
        System.out.println(this.name  + " says `woof`");
    }
}
