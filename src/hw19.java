public class hw19 {
    public static void main(String[] args) {
        int s = 100;
        int p = 1100;
        int x = 0;
        if (p > 1000) {
            x = p / 100;
        }
        s = s + p + x;
        System.out.println(s);
        System.out.println(x);
    }
}
