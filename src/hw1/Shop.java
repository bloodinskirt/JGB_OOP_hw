package hw1;

public class Shop {
    private Category[] categories;

    public Shop(Category[] categories) {
        this.categories = categories;
    }

    public void printCatalog() {
        System.out.println("Каталог продуктов:");
        for (Category category : categories) {
            System.out.println("Категория: " + category.getName());
            for (Product product : category.getProducts()) {
                System.out.println("Товар: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
            }
            System.out.println();
        }
    }
}
