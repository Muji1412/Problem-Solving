import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cro = br.readLine();

        // 크로아티아 알파벳
        // 케이스 8개, c=, c-, dz=, d-, lj, nj, s=, z=
        // 인풋값 받아서 배열로 쪼갬
        // 첫번째 케이스 - 두개씩넣음
        // for 반복문 2개 돌려서 j-1 까지 탐색해서 같은값 찾으면 카운터 ++해주기
        // 두번째 케이스 - 세개씩 넣음
        // for 반복문 3개 돌려서 j-2 까지 탐색해서 같은값 찾으면 카운터 ++

        // 빼먹은거 - 일반적으로 하나만 적어놓은 알파벳은 그냥 알파벳으로 취급해서 읽음
        // 고로 모든 알파벳을 세준 후, 크로아티아 전용 알파벳 문 만큼 빼주기?

        int croCounter = 0;

        String[] inputArr = cro.split("");

        for (int i = 0; i < cro.length() - 2; i++){
            String three = inputArr[i] + inputArr[i + 1] + inputArr[i + 2];
            if (three.equals("dz=")) {
                croCounter++;
                inputArr[i] = "";
                inputArr[i + 1] = "";
                inputArr[i + 2] = "";
            }
        }


        for (int i = 0; i < cro.length() - 1; i++) {
            String two = inputArr[i] + inputArr[i + 1];
            switch (two) {
                case "c=" :
                case "c-" :
                case "d-" :
                case "lj" :
                case "nj" :
                case "s=" :
                case "z=" :
                    croCounter++;

                    inputArr[i] = "";
                    inputArr[i + 1] = "";
                    break;
            }
        }
        for (String s : inputArr) {
            if (!s.equals("")) {
                croCounter++;
            }

        }

        System.out.println(croCounter);

    }
}
