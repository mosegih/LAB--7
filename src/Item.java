package src;

public abstract class Item {
    private String title;
    private String location;
    private boolean borrowable;

    // Constructor
    public Item(String title, String location, boolean borrowable) {
        this.title = title;
        this.location = location;
        this.borrowable = borrowable;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    // Abstract prettyPrint method
    public abstract String prettyPrint();
}