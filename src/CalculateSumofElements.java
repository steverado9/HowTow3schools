//Calculate the Sum of an Array
public class CalculateSumofElements {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, 20};
        int sum = 0;

        for (int i : myArray) {
            sum+= i;
        }
        System.out.println("The sum is: " +sum);
    }
}
