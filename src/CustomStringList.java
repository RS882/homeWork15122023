public class CustomStringList {
    private String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    public CustomStringList() {
        this.list = new String[0];
    }

    public boolean check(String str) {
        for (String elem : this.list) {
            if (str.equals(elem)) return true;
        }
        return false;
    }

    public boolean check(String[] arr) {
        for (String elem : arr) {
            if (!this.check(elem)) return false;
        }
        return true;
    }

    public String longestWord() {
        String res = this.list[0];
        for (String elem : this.list) {
            if (elem.length() > res.length()) res = elem;
        }
        return res;
    }

    public String[] getList() {
        return list;
    }

    public void add(String str) {
        String[] newList = new String[this.list.length+1];
        for (int i = 0; i < this.list.length; i++) {
            newList[i]=this.list[i];
        }
        newList[newList.length-1] = str;
        this.list= newList;
    }
}
