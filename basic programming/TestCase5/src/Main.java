class Main {
    private static boolean palindrome(String value) {
        String reverse = "";
        int length = value.length();
        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + value.charAt(i);
        }
        if (value.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
        System.out.println(palindrome("lion")); // false
    }

}