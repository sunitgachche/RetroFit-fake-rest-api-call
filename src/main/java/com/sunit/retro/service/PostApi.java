package com.sunit.retro.service;

import java.util.List;

import com.sunit.retro.model.Post;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
	
	@GET("/posts")
	Call<List<Post>> fetchAllPosts();

}
