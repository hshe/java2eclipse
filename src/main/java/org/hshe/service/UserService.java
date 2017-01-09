package org.hshe.service;

import org.hshe.core.domain.User;

public interface UserService {
	Object insert(User record);
	Object delete(Integer id);
	Object update(User record);
	Object getRecordByKey(Integer id);
	Object query(User record);
}
