import java.util.Arrays;

public class Es1 {
    public static int multi(int x, int y) {
        return x * y;
    }

    public static String concatStringNum(String word, int z) {
        return word + z;
    }

    public static String[] insertInArray(String[] arrayDi5, String word1, int pos) {
        String[] arrayDi6 = new String[arrayDi5.length + 1];
        System.arraycopy(arrayDi5, 0, arrayDi6, 0, pos);
        arrayDi6[pos] = word1;
        System.arraycopy(arrayDi5, pos, arrayDi6, pos + 1, arrayDi5.length - pos);
        return arrayDi6;
    }


    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(multi(a, b));
        int f = 1;
        String gioia = "Ciao";
        System.out.println(concatStringNum(gioia, f));
        String[] arr = {"w1", "w2", "w3", "w4", "w5"};
        String word3 = "Ciao";
        System.out.println(Arrays.toString(insertInArray(arr, word3, 2)));

    }

}
