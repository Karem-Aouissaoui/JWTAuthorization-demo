package com.karem.users.service;

import com.karem.users.entities.Role;
import com.karem.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole (Role role);
	User addRoleToUser(String username, String rolename);
}
