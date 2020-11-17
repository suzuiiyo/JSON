public class GenerateJSON {
    public static void main(String[] args) {
        String key = "name";
        Object obj = "牛头";
        String str = generateJsonString(key, obj);

        System.out.println(str);
    }
    
    public static String generateJsonString(String key, Object value) {
        JSONObject11 jsonObject = new JSONObject11();
        jsonObject.put(key, value);
        return jsonObject.toString();
    }
}