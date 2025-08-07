public class AverageOfArrayElement {
    //Create a program that calculates the average of different ages
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        //Get the length of the array
        int length = ages.length;

        //loop through the elements of the array
        for (int age : ages) {
            sum+= age;
        }
        //calculate the avarage by dividing the sum by the length
        avg = sum / length;

        System.out.println("The average age is : " + avg);
    }
}
