import java.sql.SQLOutput;

public class SearchDriver {
    public static void main(String[] args) {
        int found = LinearSearch.linearSearch(Data.data, "Tom Lee", 0, Data.data.length);
        System.out.println(found);
    }
}
