public class Main {
    public static void main(String[] args) {

        CustomStringList list = new CustomStringList(new String[]{"aaa", "DDD","rrr", "Gyy", "iii", "opwieu"});

        System.out.println(list.check("iuii"));
        System.out.println(list.check(new String[]{"aaa", "Gyy", "DDD"}));
        System.out.println(list.longestWord());
    }
}
