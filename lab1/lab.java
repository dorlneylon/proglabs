public class lab {
    public static void main(String[] args) {
        short[] l = new short[8];
        double[] x = new double[14];

        for (short i = 4, j = 0; i <= 18; i+=2, ++j) l[j] = i;
        for (int i = 0; i < 14; ++i) x[i] = Math.random()*9 - 2;

        double[][] k = new double[8][14];

        for (int i = 0; i < 8; ++i)
            for (int j = 0; j < 14; ++j)
                if (l[i] == 10) k[i][j] = Math.asin(Math.pow(countx(x[j]), 2));
                else if (check(l[i])) k[i][j] = Math.exp(Math.asin(countx(x[j]))/2);
                else k[i][j] = Math.exp(Math.sin(Math.asin(countx(x[j]))/4));

        for (double[] t : k) {
            for (double p : t) System.out.printf("%.5f ", p);
            System.out.print("\n");
        }
    }

    public static double countx(double x) {
        return (x + 2.5)/9;
    }

    public static boolean check(short t) {
        return t == 6 || t == 12 || t == 14 || t == 16;
    }
}