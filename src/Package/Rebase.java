package Package;

public class Rebase {

    public static void main(String[] args) {
        System.out.println(diff(10, 10));
    }

    public static boolean diff(int m, int n) {
        return m <= n ? true : false;
    }
}