public class App {

    public static void main(String[] args) {

        System.out.println(numReverse(583));
    }

    public static int numReverse(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
