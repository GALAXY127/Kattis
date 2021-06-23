
import java.util.ArrayList;
import java.util.Scanner;

public class NoDuplicates {

    static String sum() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        ArrayList<String> store = new ArrayList<String>();
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (!store.contains(temp[i])) {
                store.add(temp[i]);
            } else {
                return "no";
            }

        }
        return "yes";
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
    //https://open.kattis.com/problems/nodup

}

