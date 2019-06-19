package com.demo.usermanagement.repositories;

import com.demo.usermanagement.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
