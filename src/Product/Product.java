package Product;

public class Product implements Comparable<Product>{

    String productId;
    String name;
    double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product o) {
        return Double.compare(price ,o.price);
    }

    @Override
    public String toString() {
        return "Product.Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
