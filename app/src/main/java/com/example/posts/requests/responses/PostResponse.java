package com.example.posts.requests.responses;

import com.example.posts.Models.Post;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostResponse {
    @SerializedName("posts")
    @Expose()
    private Post post;
    public Post getPost(){
        return post;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
                "post=" + post +
                '}';
    }
}
