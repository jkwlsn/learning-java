public class Main {
    public static void main(String[] args) {
        String[] shoppingList = {"Apple","Banana","Herbs","Fish"};

        System.out.println("Name\t\t| Quantity\t| In Basket");
        System.out.println("-------------------------------------------");
        for (String item : shoppingList) {
            Item newItem = new Item(item, 0, false);
            System.out.print(newItem.name + "\t\t|");
            System.out.print(newItem.quantity + "\t\t|");
            System.out.print(newItem.inBasket + "\n");
            newItem.changeQuantity(10);
            newItem.toggleBasket();
            System.out.print(newItem.name + "\t\t|");
            System.out.print(newItem.quantity + "\t\t|");
            System.out.print(newItem.inBasket + "\n");
            newItem.changeQuantity(2);
            newItem.toggleBasket();
            System.out.print(newItem.name + "\t\t|");
            System.out.print(newItem.quantity + "\t\t|");
            System.out.print(newItem.inBasket + "\n");
        }
    }
}
