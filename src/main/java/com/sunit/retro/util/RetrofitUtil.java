package com.sunit.retro.util;

import com.sunit.retro.constants.RetrofitConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
	
	private  static Retrofit retro = null;
	
	public static Retrofit getRetrofitInstance() {
		
		if(retro == null) {
			
			retro = new Retrofit.Builder().baseUrl(RetrofitConstant.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
		}
		return retro;
		
	}

}
