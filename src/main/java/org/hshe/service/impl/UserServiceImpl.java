package org.hshe.service.impl;

import org.hshe.common.pojo.CommonResult;
import org.hshe.core.domain.User;
import org.hshe.core.mapper.UserMapper;
import org.hshe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public Object insert(User record) {
		mapper.insert(record);
		return CommonResult.ok();
	}

	@Override
	public Object delete(Integer id) {
		mapper.delete(id);
		return CommonResult.ok();
	}

	@Override
	public Object update(User record) {
		mapper.update(record);
		return CommonResult.ok();
	}

	@Override
	public Object getRecordByKey(Integer id) {
		return mapper.getRecordByKey(id);
	}

	@Override
	public Object query(User record) {
		return mapper.query(record);
	}

}
