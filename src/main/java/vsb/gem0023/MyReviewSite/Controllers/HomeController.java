package vsb.gem0023.MyReviewSite.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import vsb.gem0023.MyReviewSite.Entities.News;
import vsb.gem0023.MyReviewSite.Messages.HomeMSG;
import vsb.gem0023.MyReviewSite.Services.HomeService;

@RestController
//@RequestMapping(path = "/index")
public class HomeController {

    private HomeService homeService;

    @Autowired
    public  HomeController(HomeService homeService){
        this.homeService = homeService;
    }

    @GetMapping("/index")
    public HomeMSG getMSG(){

        Pageable pageable = PageRequest.of(0, 3, Sort.by("date").descending());

        Page<News> newPage = homeService.getNews(pageable);

        return new HomeMSG(newPage.getContent());
    }

    @PostMapping("/login")
    public String login(){
        return "OK";
    }

}
