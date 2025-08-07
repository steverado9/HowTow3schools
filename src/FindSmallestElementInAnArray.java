public class FindSmallestElementInAnArray {
    //Create a program that finds the lowest age among different ages:
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        //create a lowest age variable and assign the first array element to it
        int lowestAge = ages[0];

        //loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            //check if the current age is smaller than the current 'lowest age'
            if (age < lowestAge) {
                //if the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }
        //output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
