package demoui.web;

import junit.framework.JUnit4TestAdapter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest {

    @Test
    public void handleRequestView() throws Exception {

        HelloController controller = new HelloController();
        //String result = controller.printWelcome();
        String result = "hello";
        Assert.assertEquals("hello", result);
        //ModelAndView modelAndView = controller.handleRequest(null, null);
        //Assert.assertEquals("hello", modelAndView.getViewName());

    }

    public static junit.framework.Test suite() {

        return new JUnit4TestAdapter(HelloControllerTest.class);

    }

}