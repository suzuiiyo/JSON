public class JSONObject2 {
    private String person;
    private String id;
    private String name;
    private String address;

    private int id_value;
    private String name_value;
    private String address_value;
    private JSONObject2 obj_person;

    private JSONArray11 jsonArray;

    public JSONObject2(){}

    public JSONObject2(String jsonString){
        
    }

    public int getInt(String id) {
        return id_value;
    }
    
    public String getString(String name) {
        return name_value;
    }

    public String getAddress(String address) {
        return address_value;
    }
    
    public JSONObject2 getJSONObject2(String person) {
        return obj_person;
    }

    public JSONArray11 getJSONArray(String key) {
        return jsonArray;
    }
}
