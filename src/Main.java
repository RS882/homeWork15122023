import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CustomStringList list = new CustomStringList(new String[]{"aaa", "DDD","rrr", "Gyy", "iii", "opwieu"});

        System.out.println(list.check("iuii"));
        System.out.println(list.check(new String[]{"aaa", "Gyy", "DDD"}));
        System.out.println(list.longestWord());
        list.add("qqqqq");
        System.out.println(Arrays.toString(list.getList()));
        list.addIfNotExists("aaa");
        list.addIfNotExists("11aaa");
        System.out.println(Arrays.toString(list.getList()));
    }
}
