package com.webskeleton.test.integration;

import com.webskeleton.backend.persistence.domain.backend.Role;
import com.webskeleton.backend.persistence.domain.backend.User;
import com.webskeleton.backend.persistence.domain.backend.UserRole;
import com.webskeleton.backend.service.UserService;
import com.webskeleton.enums.PlansEnum;
import com.webskeleton.enums.RolesEnum;
import com.webskeleton.utils.UserUtils;
import org.junit.rules.TestName;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by taqmuq on 11/04/2016.
 */
public abstract class AbstractServiceIntegrationTest {
    @Autowired
    protected UserService userService;

    protected User createUser(TestName testName) {
        String username = testName.getMethodName();
        String email = testName.getMethodName() + "@webskeleton.com";

        Set<UserRole> userRoles = new HashSet<>();
        User basicUser = UserUtils.createBasicUser(username, email);
        userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));

        return userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
    }
}