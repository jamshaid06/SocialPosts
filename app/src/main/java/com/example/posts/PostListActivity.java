package com.example.posts;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.posts.Models.Post;
import com.example.posts.requests.PostApi;
import com.example.posts.requests.ServiceGenerator;
import com.example.posts.requests.responses.PostResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostListActivity extends BaseActivity {
    private static final String TAG = "PostListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_list);
        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               testRetrofitRequest();
            }
        });
    }
    private void testRetrofitRequest(){
        PostApi postApi = ServiceGenerator.getPostApi();
        Call<PostResponse> responseCall = postApi
                .getPostList();
        responseCall.enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
               if(response.isSuccessful()){
                    Log.d(TAG,"responseeeeee" + response.body().toString());
               }
            }

            @Override
            public void onFailure(Call<PostResponse> call, Throwable t) {
                Log.d("main", "onFailure: "+t.getMessage());
            }
        });
    }
}