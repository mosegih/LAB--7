
package src;
import java.time.LocalDate;

public class Magazine extends Item {
    private LocalDate year;
    private String issueNumber;

    // Constructor
    public Magazine(String title, String location, LocalDate year, String issueNumber) {
        super(title, location, false); // Magazines are not borrowable by default
        this.year = year;
        this.issueNumber = issueNumber;
    }

    // Getter Methods
    public String getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getYear() {
        return year;
    }

    @Override
    public String prettyPrint() {
        return "_________________________\n" +
               "| Type: Magazine        |\n" +
               "| Title: " + getTitle() + "       |\n" +
               "| Date: " + getYear().getYear() + "            |\n" +
               "| Issue: " + getIssueNumber() + "              |\n" +
               "| Can be borrowed: " + (isBorrowable() ? "Yes" : "No") + "   |\n" +
               "| Location: " + getLocation() + " |\n" +
               "_________________________";
    }
}

