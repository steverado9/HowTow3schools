public class ConvertStringToArray {
    //The simplest way is to use the toCharArray() method
    public static void main(String[] args) {
        String myStr = "Hello";

        //Convert the string to a char array
        char[] myArray = myStr.toCharArray();

        //print the array
        System.out.println(myArray[0]);

        //loop through the array and print all elements
        for (char i : myArray) {
            System.out.println(i);
        }

    }

}
