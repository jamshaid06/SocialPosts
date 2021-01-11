package com.example.posts.requests;

import com.example.posts.requests.responses.PostResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface PostApi {
    // Get Posts
    @GET("/Social-Backend-0.0.2-SNAPSHOT/api/post/all")
    Call<PostResponse> getPostList();
}
