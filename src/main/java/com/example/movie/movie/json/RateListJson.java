package com.example.movie.movie.json;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.movie.model.Rate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RateListJson {
	private Long id;
	private String name;
	
	public static RateListJson packJson(Rate rate) {
		RateListJson rlj = new RateListJson();
		rlj.setId(rate.getId());
		rlj.setName(rate.getName());
		
		return rlj;
	}
	
	public static List<RateListJson> packJsons(List<Rate> rates) {
		List<RateListJson> rateListJson = new ArrayList<RateListJson>();
		for (Rate rate : rates) {
			rateListJson.add(packJson(rate));
		}
		return rateListJson;
	}

}
