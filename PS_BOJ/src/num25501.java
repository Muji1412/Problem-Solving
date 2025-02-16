import java.util.Scanner;

public class num25501 {

    static int count = 0;

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    // isPalindrome = > 스트링 받으면 s, 0, 끝값을 리커시온에 리턴해줌
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);


    }

    // 팰린드롬이면 1, 아니면 0
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(isPalindrome(sc.next()));
            System.out.println(" " +count);
            count = 0;

        }
    }


}