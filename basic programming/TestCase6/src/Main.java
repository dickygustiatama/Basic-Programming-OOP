class Main {
    private static void Draw( int n) {
        String baris = "";
        for(int i = 1; i<= n*n; i++){
            if(i % 3 == 0){
                baris = baris + "X";
            } else if (i %2 == 0){
                baris = baris + "Z";
            } else {
                baris = baris + "Y";
            }

            if (i % n == 0){
                baris = baris + " ";
            }
        }
        String[] arrOfStr = baris.split(" ", n);
        for (String a : arrOfStr)
            System.out.println(a.replace("", " ").trim());
        System.out.println();

    }
    public static void main(String[] args) {
        Draw(3);
        Draw(5);
        Draw(1);

    }
}
