package Entity;

public class Product {
    private String id;
    private String name;
    private int price;

    public Product() {

    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String romantic_story) {
        this.name = romantic_story;
    }

    public void setPrice(int i) {
        this.price = i;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
