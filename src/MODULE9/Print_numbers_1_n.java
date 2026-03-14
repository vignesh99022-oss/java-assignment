package MODULE9;

public class Print_numbers_1_n {
    static void printNumbers(int n) {
        if (n == 0)
            return;
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}


