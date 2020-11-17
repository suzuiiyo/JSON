import java.util.Scanner;

public class JSONArray11 {
    private Object[] arr;
    private String[] key;
    private String[] value;

    private Person person;

    public void setKey(int n) {
        key = new String[n];
        System.out.println("请输入" + n + "个key的值: 以逗号隔开 ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] keyStr = str.split(" ");
        for (int i = 0; i < n; i++) {
            key[i] = keyStr[i];
        }
    }

    public String[] getKey() {
        return this.key;
    }

    public void setValue(int n) {
        value = new String[n];
        System.out.println("请输入" + n + "个value的值: 以逗号隔开 ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] valueStr = str.split(" ");
        for (int i = 0; i < n; i++) {
            value[i] = valueStr[i];
        }
        sc.close();
    }

    public String[] getValue() {
        return this.value;
    }

    public void setArr(String[] key, String[] value) {
        arr = new Object[key.length];
        for (int i = 0; i < key.length; i++) {
            arr[i] = key[i] + ": " + value[i];
        }
    }

    public Object[] getArr() {
        return this.arr;
    }


    public static void main(String[] args) {
        JSONArray11 jsonArray = new JSONArray11();
        jsonArray.setKey(10);
        jsonArray.setValue(10);
        jsonArray.setArr(jsonArray.getKey(), jsonArray.getValue());
        for (Object o : jsonArray.arr) {
            System.out.println(o);
        }
    }
}
