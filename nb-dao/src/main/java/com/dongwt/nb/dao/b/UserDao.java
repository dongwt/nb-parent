package com.dongwt.nb.dao.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.dongwt.nb.dao.base.BaseDao;
import com.dongwt.nb.model.b.User;

@Component
public class UserDao extends BaseDao<User> {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void addUser(User user){
		mongoTemplate.save(user, "b_user");
	}

}
