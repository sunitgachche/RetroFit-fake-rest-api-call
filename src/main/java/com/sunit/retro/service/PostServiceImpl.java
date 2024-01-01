package com.sunit.retro.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sunit.retro.model.Post;
import com.sunit.retro.util.RetrofitUtil;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
@Service
public class PostServiceImpl implements PostService {
	
	private Retrofit retro;
	private PostApi postApi;
	
	PostServiceImpl(){
		retro = RetrofitUtil.getRetrofitInstance();
		postApi = retro.create(PostApi.class);
	}

	@Override
	public List<Post> fetchAllPost() {
	
		List<Post> postResponse = new ArrayList<>();
		
		Call<List<Post>> fetchPostCall  = postApi.fetchAllPosts();
		try {
			Response<List<Post>> response = fetchPostCall.execute();
			if (response.isSuccessful() && response.body() != null ) {
		postResponse = response.body();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return postResponse;
		
	}

}
