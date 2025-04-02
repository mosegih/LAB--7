package src;

import java.util.ArrayList;

public class Book extends Item {
    private ArrayList<Author> authors;

    
    public Book(String title, String location, ArrayList<Author> authors) {
        super(title, location, true); // Books are borrowable by default
        this.authors = authors;
    }


    public ArrayList<Author> getAuthors() {
        return authors;
    }


    @Override
    public String prettyPrint() {
        StringBuilder authorsList = new StringBuilder();
        for (Author author : authors) {
            authorsList.append(author.getName()).append(" ");
        }
        
        return "_______________________________________\n" +
               "| Type: Book                          |\n" +
               "| Title: " + getTitle() + "         |\n" +
               "| Can be borrowed: " + (isBorrowable() ? "Yes" : "No") + "                |\n" +
               "| Author(s): " + authorsList.toString().trim() + " | \n" +
               "| Location: " + getLocation() + "               |\n" +
               "_______________________________________";
    }
}
