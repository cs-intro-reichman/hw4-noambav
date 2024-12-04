public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = str.toLowerCase();
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        if (str2 == "")
            return true;

        char firstStr2Char = str2.charAt(0);
        int firstCharIndex = ArrCharOps.indexOf(str1.toCharArray(), firstStr2Char, 0); // get index of first appearence
        while (firstCharIndex != -1) {
            if (str2.length() > str1.length() - firstCharIndex)
                return false;
            char[] subWordFrom1 = ArrCharOps.subArray(str1.toCharArray(), firstCharIndex,
                    firstCharIndex + str2.length());

            if (ArrCharOps.equals(subWordFrom1, str2.toCharArray()))
                return true;
            firstCharIndex = ArrCharOps.indexOf(str1.toCharArray(), firstStr2Char, firstCharIndex + 1); // get index of
                                                                                                        // next
            // appearence
        }

        return false;
    }
}
