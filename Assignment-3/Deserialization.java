import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Serialization
    public void serializeProduct(Product product, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Product is serialized and saved in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization
    public Product deserializeProduct(String fileName) {
        Product product = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            product = (Product) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Electronics", 1000);

        // Serialize the product
        product.serializeProduct(product, "product.ser");

        // Deserialize the product
        Product deserializedProduct = product.deserializeProduct("product.ser");
        System.out.println("Deserialized Product:");
        System.out.println(deserializedProduct);
    }
}
