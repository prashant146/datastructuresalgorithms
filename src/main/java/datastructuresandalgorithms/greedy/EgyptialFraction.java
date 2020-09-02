package datastructuresandalgorithms.greedy;

public class EgyptialFraction {

    private static void getEgyptialFraction(int nr, int dr){

        if (dr == 0 || nr == 0) {
            return;
        }

        // If numerator divides denominator,
        // then simple division makes
        // the fraction in 1/n form
        if (dr % nr == 0) {
            System.out.print("1/" + dr / nr);
            return;
        }

        // If denominator divides numerator,
        // then the given number is not fraction
        if (nr % dr == 0) {
            System.out.print(nr / dr);
            return;
        }

        // If numerator is more than denominator
        if (nr > dr) {
            System.out.print(nr / dr + " + ");
            getEgyptialFraction(nr % dr, dr);
            return;
        }

        // We reach here dr > nr and dr%nr
        // is non-zero. Find ceiling of
        // dr/nr and print it as first
        // fraction
        int n = dr / nr + 1;
        System.out.print("1/" + n + " + ");

        // Recur for remaining part
        getEgyptialFraction(nr * n - dr, dr * n);
    }

    // Driver Code
    public static void main(String[] args) {
        int nr = 26, dr = 2;
        System.out.print("Egyptian Fraction Representation of "
                + nr + "/" + dr + " is\n ");
        getEgyptialFraction(nr, dr);
    }
}



