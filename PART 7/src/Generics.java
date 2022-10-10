
public class Generics {
    public static void insertionSort(Object[] a) {
        for (int i=0;  i != a.length;  i = i+1) {
            int j = i;
            while (j != 0  &&  a[j-1].equals(a[i])){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = a[i];
        }
    }
}