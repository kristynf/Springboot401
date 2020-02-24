package com.kristyn.springboot401;

import org.springframework.data.repository.CrudRepository;

//import javax.management.relation.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
