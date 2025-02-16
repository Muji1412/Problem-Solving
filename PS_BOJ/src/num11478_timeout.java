import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class num11478_timeout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오
        //부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
        //ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고,
        //서로 다른것의 개수는 12개이다


        // 문자열 들어옴
        // 일단 다 쪼개서 보관 - 0개일때, 0+1개,2개,3개..
        // 해시셋에 같은값 보관하면 어차피 날아가버림,

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 쪼개기용 어레이
        String[] arr = st.nextToken().split("");
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = -1;
            //0,1,2,3,4 => 5번반복
            for (int j = i; j < arr.length; j++) {
                count++;
                StringBuilder sb =  new StringBuilder();
                for (int k = count; k <= j; k++) {
//                    System.out.println("현재 k값 : " + k);
//                    System.out.println(arr[k]);
                    sb.append(arr[k]);

                }
                set.add(sb.toString());
//                System.out.println(sb);
                sb.setLength(0);

                //0, 01234
                //1, 1234
                //2, 234
                //3, 34
                //4, 4

                //어떻게 만들어야 하나
                // 0부터 n까지, 0+1부터 n+1까지,0+2부터 n+2까지
                // 0부터 j까지, 0+1부터 j까지, 0+2부터 j까지



                //charAt 0부터 1까지, 1부터 2까지 2,3 3,4
                //0부터 2까지, 1부터 3까지, 2부터 4까지

            }
            //arr 0, arr 1, arr 2, arr 3, arr 4,
            //arr 0,1 arr 1,2 arr 2,3 arr 3,4
            //arr 0,1,2 arr 1,2,3 arr 2,3,4
            //arr 0,1,2,3 arr 1,2,3,4
            //arr 0,1,2,3,4
        }

        System.out.println(set.size());
    }
}
