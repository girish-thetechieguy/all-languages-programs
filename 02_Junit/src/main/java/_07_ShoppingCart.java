import java.util.ArrayList;
import java.util.List;

public class _07_ShoppingCart {
    private List<_06_Product> products;

    public _07_ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(_06_Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
    }

    public void removeProduct(_06_Product product) {
        if (!products.remove(product)) {
            throw new IllegalArgumentException("Product not found in cart");
        }
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(_06_Product::getPrice).sum();
    }

    public List<_06_Product> getProducts() {
        return new ArrayList<>(products);
    }
}
