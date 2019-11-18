import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, ArrayList<String>> solution = new HashMap<Integer, ArrayList<String>>();

        int members = s.nextInt();

        for (int i = 0; i < members; i++) {
            String memName = s.next();
            Integer memHeight = s.nextInt();

            if (solution.containsKey(memHeight)) {
                ArrayList<String> namesArr = solution.get(memHeight);
                namesArr.add(memName);
                namesArr.sort(String::compareTo);
                solution.put(memHeight,namesArr);
            } else {
                ArrayList<String> namesArr = new ArrayList<String>();
                namesArr.add(memName);
                solution.put(memHeight,namesArr);
            }
        }

        List keyList = new ArrayList(solution.keySet());
        int num = 0;
       // Collections.sort(keyList);

        for (int i = 0; i < solution.size(); i++) {
            ArrayList<String> nameDisplay = solution.get(keyList.get(i));
            for (String str : nameDisplay) {
                System.out.print(str + " ");
            }
            System.out.println(num+1 + " " + (num+nameDisplay.size()));
            num = num+nameDisplay.size();
        }
    }
}