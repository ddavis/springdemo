package springapp.domain;

import junit.framework.JUnit4TestAdapter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import springapp.web.HelloController;

import junit.framework.TestCase;


/**
 * User: ddavis
 */
public class UserTest {

    @Test
    public void setAndGetUser() throws Exception {

        User testUser = new User();

        testUser.setUserName("testuser");
        Assert.assertEquals("testuser", testUser.getUserName());

        testUser.setFamilyName("davis");
        Assert.assertEquals("davis", testUser.getFamilyName());

        testUser.setGivenName("daniel");
        Assert.assertEquals("daniel", testUser.getGivenName());

    }

    public static junit.framework.Test suite() {

        return new JUnit4TestAdapter(UserTest.class);

    }

}
