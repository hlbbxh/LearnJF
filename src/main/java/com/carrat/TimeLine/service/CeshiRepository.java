package com.carrat.TimeLine.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.carrat.TimeLine.entity.Ceshi;

@Service
public interface CeshiRepository extends MongoRepository<Ceshi, String>{
	//注意是接口 不是class
	public Ceshi findBytitle(String title); 
	//注意 这里 有点像JPA的方式 findBy 后面是要 查询的字段 
}
