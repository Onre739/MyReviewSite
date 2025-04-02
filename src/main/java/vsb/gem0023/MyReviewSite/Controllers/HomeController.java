package vsb.gem0023.MyReviewSite.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsb.gem0023.MyReviewSite.Messages.HomeMSG;

@RestController
//@RequestMapping(path = "/index")
public class HomeController {

    @GetMapping("/index")
    public HomeMSG getMSG(){
        return new HomeMSG(null, null, null);
    }

    @PostMapping("/login")
    public String login(){
        return "OK";
    }

}
