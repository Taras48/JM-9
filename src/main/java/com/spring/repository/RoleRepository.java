package com.spring.repository;

import com.spring.model.Role;

public interface RoleRepository {

    Role findAllByRole(String role);

}