package com.webskeleton.backend.persistence.repositories;

import com.webskeleton.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taqmuq on 29/03/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}