package com.nab.edcm.useraudit.persistence.repos;

import com.nab.edcm.useraudit.persistence.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
