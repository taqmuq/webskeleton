package com.webskeleton.test.integration;

import com.webskeleton.WebskeletonApplication;
import com.webskeleton.backend.persistence.domain.backend.PasswordResetToken;
import com.webskeleton.backend.persistence.domain.backend.User;
import com.webskeleton.backend.service.PasswordResetTokenService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by taqmuq on 10/04/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebskeletonApplication.class)
public class PasswordResetTokenServiceIntegrationTest extends AbstractServiceIntegrationTest {

    @Autowired
    private PasswordResetTokenService passwordResetTokenService;

    @Rule public TestName testName = new TestName();

    @Test
    public void testCreateNewTokenForUserEmail() throws Exception {

        User user = createUser(testName);

        PasswordResetToken passwordResetToken =
                passwordResetTokenService.createPasswordResetTokenForEmail(user.getEmail());
        Assert.assertNotNull(passwordResetToken);
        Assert.assertNotNull(passwordResetToken.getToken());

    }

    @Test
    public void testFindByToken() throws Exception {
        User user = createUser(testName);

        PasswordResetToken ptr1 =
                passwordResetTokenService.createPasswordResetTokenForEmail(user.getEmail());
        Assert.assertNotNull(ptr1);
        Assert.assertNotNull(ptr1.getToken());
        String token1 = ptr1.getToken();

        PasswordResetToken ptr2 = passwordResetTokenService.findByToken(token1);
        String token2 = ptr2.getToken();
        Assert.assertEquals(token1,token2);

    }

}