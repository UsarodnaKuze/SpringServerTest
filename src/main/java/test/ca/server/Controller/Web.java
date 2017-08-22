package test.ca.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ghory on 2017. 08. 22..
 */
@Controller
public class Web {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
