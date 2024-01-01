package com.sunit.retro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunit.retro.model.Post;
import com.sunit.retro.service.PostService;

@RestController

@RequestMapping("v1/retro")
public class PostController {
	@Autowired
	private PostService postService;
 
	@GetMapping("/all")
	public List<Post> fetchAllPosts(){
		
		return postService.fetchAllPost();
		
	}
}
