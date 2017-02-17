import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class SortCLI {
    public static void main(String[] args) throws Exception {
        int length = args.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<length; i++) {
            list.add(Integer.parseInt(args[i]));
        }
        // start reordering the list
        for(int i=0; i<list.size(); i++) {
            int x = list.remove(i);
            for(int j=0; j<=i; j++) {
                if (j == i) {
                    list.add(i, x);
                } else {
                    if (list.get(j) > x) {
                        list.add(j, x);
                        j += list.size() + 100;
                    }
                }
            }
            printArr(list);
        }
    }

    static void printArr(ArrayList<Integer> arr) {
        for(int i=0; i<arr.size(); i++) {
            if (i < arr.size() - 1) {
                System.out.print(Integer.toString(arr.get(i)) + " ");
            } else {
                System.out.println(Integer.toString(arr.get(i)));
            }
        }
        // System.out.println(Arrays.toString(arr));
    }
}
