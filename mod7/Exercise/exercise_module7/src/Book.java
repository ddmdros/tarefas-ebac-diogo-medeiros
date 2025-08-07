public class Book {
    String name;
    String author;
    double price;
    int itemsInStock;
    long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public void showBookInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Price: US$" + this.price);
        System.out.println("Items in stock: " + this.itemsInStock);
        System.out.println("Id: " + this.id);

    }
}
