import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamDivider {
    public static void main(String[] args) {
// 17명의 이름을 리스트에 추가
        List<String> names = new ArrayList<>();
        names.add("박종범");
        names.add("민대건");
        names.add("김대영");
        names.add("손유경");
        names.add("이선진");
        names.add("이주연");
        names.add("강유진");
        names.add("김나연");
        names.add("김현수");
        names.add("김형섭");
        names.add("안종수");
        names.add("고태원");
        names.add("최상균");
        names.add("송택호");
        names.add("문경민");
        names.add("박찬영");
        names.add("홍길동");

        // 이름 목록을 무작위로 섞는다.
        Collections.shuffle(names);

        // 4개의 팀 리스트 생성
        List<List<String>> teams = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            teams.add(new ArrayList<>());
        }

        // 라운드로빈 방식 (i % 4)으로 각 팀에 이름 할당
        for (int i = 0; i < names.size(); i++) {
            teams.get(i % 4).add(names.get(i));
        }

        // 각 팀별로 출력
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("팀 " + (i + 1) + ": " + teams.get(i));
        }
    }
}