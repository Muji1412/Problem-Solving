import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num1157_withGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        // 각 알파벳 카운트
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(map.containsKey(c)) {
                int count = map.get(c);    // 현재 저장된 개수를 가져오고
                count++;                   // 1 증가시킨 다음
                map.put(c, count);         // 다시 저장
            } else {
                map.put(c, 1);            // 처음 나온 글자면 1로 저장
            }
        }
        // 가장 많이 사용된 알파벳 찾기
        int max = 0;
        char result = '?';

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == max) {
                result = '?';
            }
        }

        System.out.println(result);

    }

}