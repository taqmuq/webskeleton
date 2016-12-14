package com.webskeleton.backend.persistence.repositories;

import com.webskeleton.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taqmuq on 29/03/2016.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}