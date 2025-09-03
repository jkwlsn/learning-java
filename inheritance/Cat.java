public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void noise() {
        System.out.println(this.name  + " says `miaow`");
    }
}
