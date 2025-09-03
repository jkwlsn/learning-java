public class Item {
    String name;
    int quantity;
    boolean inBasket;

    public Item(String name, int quantity, boolean inBasket) {
        this.name = name;
        this.quantity = quantity;
        this.inBasket = inBasket;
    }

    public void changeQuantity(int number){
        this.quantity = number;
    }

    public void toggleBasket(){
        this.inBasket =! this.inBasket;
    }

    public void output(){
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(inBasket);
    }

    public void main(String[] args) {
    }
}
