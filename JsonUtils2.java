import java.util.Iterator;

import net.sf.json.JSONException;

import java.util.List;
import net.sf.json.JSONObject;

public class JsonUtils2 {
    public static List<DataModel> getGsonList(String json){
        List<DataModel> dataList;
        try{
            JSONObject rootObject = new JSONObject(json);
            JSONObject paramzObject = rootObject.getJSONObject("paramz");

        /**
         * JSONArray的构造方法获取JSONArray对象
         */
        JSONArray jsonArray = new JSONArray(paramzObject.getString("feeds"));
        Log.i(TAG, "jsonarray.length():"+jsonArray.length());

        /**
         * 获取JSONObject对象的属性关键字
         */
        Iterator<String> iterators = paramzObject.keys();
        while(iterators.hasNext()){
            Log.i(TAG, "iterators: " + iterators.next());
        }
        JSONArray feeds = paramzObject.getJSONArray("feeds");
        dataList = new ArrayList<>();
        for(int i=0; i<feeds.length(); i++){
            JSONObject jsonObject = feeds.getJSONObject(i);
            DataModel model = new Gson().fromJson(jsonObject.getString("data"), new TypeToken<DataModel>(){
            }.getType());
            Log.i(TAG, "DataModel: " + model.toString());
            dataList.add(model);
        }
        return dataList;
    }catch(JSONException e){
        e.printStackTrace();
    }

    return null;
}
