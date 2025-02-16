
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//답은 맞는데 2초 넘겨서 오답


public class num1181_timeout {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        //중복단어 제거
        sameKiller(arr);
//        System.out.println("중복단어 제거 이후");

        //길이별로 정렬
        lengthArrange(arr);
//        System.out.println("길이별로 정렬 이후");

        //길이 지키면서 사전순 정렬
        sortArr(arr);
//        System.out.println("길이 지키고 사전순 정렬 이후");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("-1")) {
                System.out.println(arr[i]);
            }
        }




    }
    //길이가 짧은 것부터
    //길이가 같으면 사전 순으로
    //단, 중복된 단어는 하나만 남기고 제거해야 한다.


    //중복단어 없애기

    //값 바꿔주기 메서드
    //어레이 + 바꿔줄 정수값
    public static void abChanger(String[] arr, int n) {
        String temp = arr[n];
        arr[n] = arr[n + 1];
        arr[n + 1] =temp;
    }

    public static String[] sameKiller(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (!arr[i].equals("-1") && arr[i].equals(arr[j])){
                    arr[j] = "-1";
                }
            }
        }
        return arr;

    }

    //길이별로 정렬하기

    public static String[] lengthArrange(String[] arr) {
        //i랑 i+1의 길이를 비교, 같으면 냅두고 다르면 바꿔줌
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    abChanger(arr, j);
                }
            }
        }
        return arr;
    }


    //사전순별로 정렬
    //아스키값 토대로, 65부터 시작해서 char값이 더 크면 둘이 바꿔줌.
    // 단, 둘이 렝스값이 같을때만 비교해서 바꿔줌
    // 이중으로 안해주니까 no는 뒤로 보내주는데 it im은 안바뀜ㅋㅋ 이중으로 해야함

    public static String[] sortArr(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 같은 길이의 문자열끼리만 비교
                if (arr[j].length() == arr[j + 1].length()) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        abChanger(arr, j);
                    }
                }
                // 길이가 다르면 그냥 넘어감
            }
        }
        return arr;
    }
}

