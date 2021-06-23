mport java.util.Scanner;

public class Backspace {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int y =0;
        for(int i = s.length()-1; i>= 0; i--){
            if(ch[i] == '<'){
                ch[i] = ' ';
                y++;
            }
            else if(y >0 ){
                ch[i] = ' ';
                y--;
            }
        }
        s = new String(ch);
       System.out.println(s.replaceAll(" ", ""));

    }

    public static void main(String[] args) {
        sum();
    }

}
