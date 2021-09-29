package com.example.hackillinoisstaffappproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.Volley;
import com.android.volley.VolleyError;
import org.json.JSONObject;
import org.json.JSONArray;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;

import com.android.volley.Response;
import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;




public class MainActivity extends AppCompatActivity {

    private RecyclerView mentorsRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mentorsRV = findViewById(R.id.mentorsRV);

        ArrayList<Mentor> mentors = new ArrayList<>();
        String url = "https://api.hackillinois.org/upload/blobstore/mentors/";

        RequestFuture<JSONObject> requestFuture=RequestFuture.newFuture();
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,
                url,null,requestFuture,requestFuture);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

        JSONObject r = requestFuture.get();
        JSONArray a = r.getJSONArray("data");
        for (int i = 0; i < a.length(); i++) {
            JSONObject k = a.getJSONObject(i);
            mentors.add(new Mentor(k.getString("firstName"), k.getString("lastName"), k.getString("description"), k.getString("profile")));
        }
        //mentors.add(new Mentor("Mentor1", "last1", "description of m1", "https://hackillinois-upload.s3.amazonaws.com/photos/mentors/josh_sanchez.jpg"));
        //mentors.add(new Mentor("Mentor2", "last2", "description of m1", "https://hackillinois-upload.s3.amazonaws.com/photos/mentors/default.png"));

        MentorsRVAdapter adapter = new MentorsRVAdapter();
        adapter.setMentors(mentors);

        mentorsRV.setAdapter(adapter);
        mentorsRV.setLayoutManager(new LinearLayoutManager(this));



    }
}