public class hw19 {
    public static void main(String[] args) {
        int check = 100;
        int plus = 1100;
        int bonus = 0;
        if (plus > 1000) {
            bonus = plus / 100;
        }
        check = check + plus + bonus;
        System.out.println(check);
        System.out.println(bonus);
    }
}
