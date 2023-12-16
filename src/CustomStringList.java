public class CustomStringList {
    private String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    public CustomStringList() {
        this.list = new String[0];
    }

    public boolean check(String str){
        for (String elem: this.list) {
            if(str.equals(elem)) return true;
        }
        return false;
    }


}
