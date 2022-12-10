package questionsFrom1To5;

public class Main {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("Test string", 'i'));
        System.out.println(findSymbolOccurrence("Test string", 's'));

        String[] source = {"Apollo", "Apple", "Solution"};
        String[] target = {"pollo", "plant", "ion", "no"} ;

        System.out.printf("\nSource: %s\nTarget: %s\nResult: %d\n\n",
                source[0], target[0], findWordPosition(source[0], target[0]));
        System.out.printf("Source: %s\nTarget: %s\nResult: %d\n\n",
                source[1], target[1], findWordPosition(source[1], target[1]));
        System.out.printf("Source: %s\nTarget: %s\nResult: %d\n\n",
                source[2], target[2], findWordPosition(source[2], target[2]));
        System.out.printf("Source: %s\nTarget: %s\nResult: %d\n\n",
                source[2], target[3], findWordPosition(source[2], target[3]));

        String s01 = "Helllo";
        String s02 = "Solution";
        System.out.println(s01 + " ->" + stringReverse(s01));
        System.out.println(s02 + " ->" + stringReverse(s02));

        System.out.println(s01 + " ->" + stringReverse02(s01));
        System.out.println(s02 + " ->" + stringReverse02(s02));

        String[] s03 = {"ERE", "Allo", "ALLO", "ALLA"};
        System.out.printf("\n%s -> %b\n", s03[0], isPalindrome(s03[0]));
        System.out.printf("%s -> %b\n", s03[1], isPalindrome(s03[1]));
        System.out.printf("%s -> %b\n", s03[2], isPalindrome(s03[2]));
        System.out.printf("%s -> %b\n", s03[3], isPalindrome(s03[3]));

    }

    static int findSymbolOccurrence(String string, char character) {
        int counter = 0;
        for (char ch : string.toCharArray()) {
            if (ch == character) {
                counter++;
            }
        }
        return counter;
    }

    static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    static String stringReverse(String string) {
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();
    }

    static String stringReverse02(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    static boolean isPalindrome(String s) {
        String temp = new StringBuffer(s).reverse().toString();
        return s.equals(temp);
    }
}