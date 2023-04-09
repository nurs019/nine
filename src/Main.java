public class Main {
    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        int Cn = 1;

        for (int i = 0; i <= k; i++) {
            Cn *= (n - i);
            Cn /= (i + 1);
        }

        System.out.println("C" + n + "," + k + " = " + Cn);

        n = 7;
        k = 3;
        Cn = 1;

        for (int i = 0; i <= k; i++) {
            Cn *= (n - i);
            Cn /= (i + 1);
        }

        System.out.println("C" + n + "," + k + " = " + Cn);
    }
}
