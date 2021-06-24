import java.util.Scanner;

public class Aaah{
      static String sum(){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        return ((x.length() >= y.length()) ? "go" : "no");
    }
    public static void main(String[] args) {
        
        System.out.println(sum());
    }

}
