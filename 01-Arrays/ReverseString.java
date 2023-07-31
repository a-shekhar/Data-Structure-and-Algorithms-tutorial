public class ReverseString {
    // using the String
    private String reserveString1(String str){
        if (str == null || str.length() == 0 || str.trim().length() == 0){
            return "";
        }

        String reverse = new String();

        for(int i = 0; i < str.length(); i++){
            reverse = str.charAt(i) + reverse;
        }

        return reverse;
    }

    // using the String
    private String reserveString2(String str){
        if (str == null || str.length() == 0 || str.trim().length() == 0){
            return "";
        }

        String reverse = new String();

        for(int i = str.length() - 1; i >=0 ; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }


    // using the StringBuilder
    // Similarly StringBuffer can be used
    private StringBuilder reserveString3(String str){
        if (str == null || str.length() == 0 || str.trim().length() == 0){
            return new StringBuilder("");
        }

        StringBuilder result = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
             result.append(str.charAt(i));
        }

        return result.reverse();
    }

    private StringBuilder reserveString4(String str){
        if (str == null || str.length() == 0 || str.trim().length() == 0){
            return new StringBuilder("");
        }

        StringBuilder result = new StringBuilder(str);

        return result.reverse();
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String str1 = "Aditya Raj says Hi and Hello";
        String str2 = "Twitter is X now.";

        System.out.println(obj.reserveString1(str1));
        System.out.println(obj.reserveString2(str1));
        System.out.println(obj.reserveString3(str1));
        System.out.println(obj.reserveString4(str1));

        System.out.println(obj.reserveString1(str2));
        System.out.println(obj.reserveString2(str2));
        System.out.println(obj.reserveString3(str2));
        System.out.println(obj.reserveString4(str2));
    }
}
