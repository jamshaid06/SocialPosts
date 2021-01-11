package com.example.posts.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Post implements Parcelable {
    private String username;
    private String location;
    private String title;
    private String imageUrl;

    public Post(String username, String location, String title, String imageUrl) {
        this.username = username;
        this.location = location;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public Post() {
    }

    protected Post(Parcel in) {
        username = in.readString();
        location = in.readString();
        title = in.readString();
        imageUrl = in.readString();
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Post{" +
                "username='" + username + '\'' +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(location);
        dest.writeString(title);
        dest.writeString(imageUrl);
    }
}
