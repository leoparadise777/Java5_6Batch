package Day2;import java.util.*;

public class Assignment1_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            if(s.equals("q")){
                System.out.println("quit");
                break;
            }
            else{
                int n = Integer.parseInt(s);
                if(n <= 0){
                    System.out.println("Error");
                }
                else{
                    System.out.println(doSomthing(n));
                }
            }
        }
        // System.out.println(1>0?"A":"B");
    }

    public static int doSomthing(int n){
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
        }
        return res;
    }

}
