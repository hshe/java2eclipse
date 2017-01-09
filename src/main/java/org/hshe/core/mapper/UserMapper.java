package org.hshe.core.mapper;

import java.util.List;

import org.hshe.core.domain.User;

public interface UserMapper {
	
	public void insert(User record);
	public void delete(Integer id);
	public void update(User record);
	public User getRecordByKey(Integer id);
	public List<User> query(User record);
	
}
