import java.util.ArrayList;
import java.util.List;

public class JsonTools {
    public static Person getPerson(String key, String jsonString) {
        Person person = new Person();
        try {
            JSONObject2 jsonObject = new JSONObject2();

            JSONObject2 personObject = jsonObject.getJSONObject2("person");
            person.setId(personObject.getInt("id"));
        } catch (Exception e) {
            //TODO: handle exception
        }
        return person;
    }
    
    public static List getPersons(String key, String jsonString) {
        List list = new ArrayList();
        try{
            JSONObject2 jsonObject = new JSONObject2(jsonString);
            //返jsonj的数组
            JSONArray11 jsonArray = jsonObject.getJSONArray(key);
            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject2 jsonObject2 = jsonArray.getJSONAObject(i);
                Person person = new Person();
                person.setId(jsonObject2.getInt("id"));
                person.setName(jsonObject2.getString("name"));
                person.setAddress(jsonObject.getString("address"));
                list.add(person);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return list;
    }
}
