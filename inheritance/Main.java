public class Main {
    public static void main(String[] args) {
        Cat shanie = new Cat("Shanie");
        Cat tiddles = new Cat("Tiddles");
        Cat tibeau = new Cat("Tibeau");

        shanie.noise();
        tiddles.noise();
        tibeau.noise();

        shanie.setVetId(1);
        tiddles.setVetId(2);
        tibeau.setVetId(3);

        shanie.getVetId();
        tiddles.getVetId();
        tibeau.getVetId();

        Dog fido = new Dog("Fido");
        Dog rex = new Dog("Rex");
        Dog poochie = new Dog("Poochie");

        fido.noise();
        rex.noise();
        poochie.noise();

    }
}
