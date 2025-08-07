import java.util.Arrays;

public class SortArray {
    //You can use the sort() method, found in java.util.Arrays, to sort an array
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars); //sort the arrays
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
