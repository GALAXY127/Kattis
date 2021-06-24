import java.util.Scanner;

public class AddTwoNumbers{
    static int sum(){
        Scanner sc = new Scanner(System.in);
        String store = sc.nextLine();
        String[] s = store.split(" ");
        return Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
    }
    public static void main(String[] args) {
        
        System.out.println(sum());
    }

}
