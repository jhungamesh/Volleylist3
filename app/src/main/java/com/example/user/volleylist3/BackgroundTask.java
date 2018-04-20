package com.example.user.volleylist3;

import android.content.Context;

import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;



/**192.168.1.109
 * Created by User on 13/04/2018.
 */

public class BackgroundTask {
    Context context;
    ArrayList<Scoreboard_Item> arrayList = new ArrayList<>();
    String json_url = "http://192.168.1.109/Sup2.php";

    public BackgroundTask(Context context)
    {
        this.context = context;
    }

    public ArrayList<Scoreboard_Item> getList() {

        final JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST,json_url, (String)null,
                new Response.Listener<JSONArray>(){
            @Override
                    public void onResponse(JSONArray response){
                        int count = 0;
                        while(count<response.length()){

                            try {
                                JSONObject jsonObject = response.getJSONObject(count);
                                Scoreboard_Item scoreboard_item = new Scoreboard_Item(jsonObject.getString("Username"), jsonObject.getString("Team1"), jsonObject.getString("Team2"), jsonObject.getString("Sport"), jsonObject.getString("Status"));
                                arrayList.add(scoreboard_item);
                                count++;
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

            }
                }, new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Toast.makeText(context, "Error",Toast.LENGTH_SHORT).show();
                        error.printStackTrace();
                    }
        }
        );
        MySingleton.getInstance(context).addToRequetque(jsonArrayRequest);
        return arrayList;
    }
}
