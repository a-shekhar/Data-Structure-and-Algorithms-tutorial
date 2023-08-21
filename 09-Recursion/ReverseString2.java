public class ReverseString2 {
    String result = "";

    public String reverseString(String str){
        if(str.length() == 0){
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        ReverseString2 reverseString = new ReverseString2();
        System.out.println(reverseString.reverseString("Aditya"));
        System.out.println(reverseString.reverseString("Nishu"));
        System.out.println(reverseString.reverseString("Prabhat"));
    }
}
