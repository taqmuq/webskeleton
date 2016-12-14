package com.webskeleton.backend.persistence.repositories;

import com.webskeleton.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taqmuq on 29/03/2016.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}