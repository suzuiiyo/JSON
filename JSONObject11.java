public class JSONObject11 {
    private String key;
    private Object value;

    public void put(String key, Object value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public String toString(){
        return "[" + key + ": " + value + "]";
    }
}
