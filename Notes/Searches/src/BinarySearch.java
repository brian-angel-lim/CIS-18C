public class BinarySearch {
    public static int search(String[] data, String searchTerm, int low, int high, int counter) {
        //Base Case
        if(low > high) {
            return -1;
        }else {
            int mid = (low + high) / 2;
            if (searchTerm.equals(data[mid])) {
                return mid;
            } else if (searchTerm.compareTo(data[mid]) > 0) {
                return search(data, searchTerm, mid + 1, high, ++counter);
                // change the low to the midpoint
                // keep everything the same
                // and call search again
            } else {
                return search(data, searchTerm, mid - 1, high, ++counter);
                // change the high to the midpoint
                // keep everything the same
                // and call search again
            }
        }
    }
}
