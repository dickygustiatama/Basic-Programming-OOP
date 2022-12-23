public class Main {
    private static boolean primeNumber(int number) {
        int jfaktor = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                jfaktor++;
            }
        }
        if (jfaktor > 2) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false
    }

}