import java.util.Scanner;

public class SimonSays {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int attempt = sc.nextInt();
        for(int i = 0; i <= attempt; i++){
            String s = sc.nextLine().toLowerCase();
            if(s.startsWith("simon says")){
                System.out.println(s.replaceAll("simon says " , ""));
            }else{
                System.out.println("");
            }
        }


    }

    public static void main(String[] args) {
        sum();
    }

}
