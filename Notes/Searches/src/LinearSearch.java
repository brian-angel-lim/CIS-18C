

public class LinearSearch {
    public static int linearSearch(String[] data, String searchTerm, int low, int high){
        if (data[low].equals(searchTerm)) {
            return low;
        } else if (low == high) {
            return -1;
        } else {
            return linearSearch(data, searchTerm, ++low, high);
        }
    }
}
