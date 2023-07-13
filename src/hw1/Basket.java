package hw1;

public class Basket {
    private Product[] products;

    public Basket() {
        products = new Product[0];
    }

    public void addProduct(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        products = newProducts;
    }

    public void removeProduct(Product product) {
        if (containsProduct(product)) {
            Product[] newProducts = new Product[products.length - 1];
            int index = 0;
            for (Product p : products) {
                if (!p.equals(product)) {
                    newProducts[index] = p;
                    index++;
                }
            }
            products = newProducts;
        }
    }

    public boolean containsProduct(Product product) {
        for (Product p : products) {
            if (p.equals(product)) {
                return true;
            }
        }
        return false;
    }

    public Product[] getProducts() {
        return products;
    }
}
