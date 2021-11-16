import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SteamTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        for(int i=0;i<squaresList.size();i++){
            System.out.println(squaresList.get(i));
        }
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        List<String> count = strings.stream().filter(string -> string.isEmpty()).collect(Collectors.toList());
        for(int j=0;j<count.size();j++){
            System.out.println("j:"+count.get(j));
        }

    }
}
