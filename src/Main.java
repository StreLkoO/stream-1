import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> result = new TreeSet<>();
        for (int elem : intList) {
            if (elem > 0 && elem % 2 == 0) {
                result.add(elem);
            }
        }
        System.out.println(result);
    }
}
