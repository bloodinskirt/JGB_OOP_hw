 public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Товар 1", 100.0, 4);
        Product product2 = new Product("Товар 2", 200.0, 5);
        Product product3 = new Product("Товар 3", 300.0, 3);

        Category category1 = new Category("Категория 1", new Product[] {product1, product2});
        Category category2 = new Category("Категория 2", new Product[] {product3});

        Shop shop = new Shop(new Category[] {category1, category2});

        shop.printCatalog();

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product3);

        System.out.println("Покупки пользователя " + user1.getLogin() + ":");
        for (Product product : user1.getBasket().getProducts()) {
            System.out.println("Товар: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }

        System.out.println();

        System.out.println("Покупки пользователя " + user2.getLogin() + ":");
        for (Product product : user2.getBasket().getProducts()) {
            System.out.println("Товар: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }
    }
}