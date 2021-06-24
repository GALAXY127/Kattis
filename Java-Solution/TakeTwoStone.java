import java.util.Scanner;

public class TakeTwoStone{
    static String sum(){
      Scanner sc = new Scanner(System.in);
        if(sc.nextInt() % 2 == 1){
            return "Alice";

        }
        return "Bob";
    }
    public static void main(String[] args) {
        
        System.out.println(sum());
    }

}
