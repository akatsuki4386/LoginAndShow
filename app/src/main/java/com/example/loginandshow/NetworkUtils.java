package com.example.loginandshow;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class NetworkUtils {
        // 编写获取数据函数
    public Object getData(Context context) {
        //定义新的请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        String url = "http://127.0.0.1:8000/"; // 请求的网址
        // 创建新的请求
        List<Contact> contactList;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                contactList = gson.fromJson(response, new TypeToken<List<Contact>>() {
                }.getType());
            }
        });
        return null;
    }
}