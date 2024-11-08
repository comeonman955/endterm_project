import java.util.ArrayList;
import java.util.List;

public class Section implements LibraryItem {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void display() {
        for (LibraryItem item : items) {
            item.display();
        }
    }
}
