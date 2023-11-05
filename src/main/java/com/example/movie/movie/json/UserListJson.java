package com.example.movie.movie.json;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.movie.model.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserListJson {
	private Long id;
	private String userName;
	private String password;
	
	public static UserListJson packJson(User user) {
		UserListJson ulj = new UserListJson();
		ulj.setId(user.getId());
		ulj.setUserName(user.getUserName());
		ulj.setPassword(user.getPassword());

		return ulj;
	}
	
	public static List<UserListJson> packJsons(List<User> users) {
		List<UserListJson> userListJson = new ArrayList<UserListJson>();
		for (User user : users) {
			userListJson.add(packJson(user));
		}
		return userListJson;
	}


}
