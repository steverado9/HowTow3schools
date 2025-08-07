public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            // = H + "";
            //H = e + H;
            //eH = l + eH;
            //leH = l + leH;
            //lleH = o + lleH;
            //olleH;
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}
