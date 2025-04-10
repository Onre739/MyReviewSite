package vsb.gem0023.MyReviewSite.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import vsb.gem0023.MyReviewSite.Entities.GameReview;
import vsb.gem0023.MyReviewSite.Entities.News;
import vsb.gem0023.MyReviewSite.Messages.HomeMSG;
import vsb.gem0023.MyReviewSite.Services.HomeService;

@RestController
@RequestMapping(path = "/api/index")
public class HomeController {

    private HomeService homeService;

    @Autowired
    public  HomeController(HomeService homeService){
        this.homeService = homeService;
    }

    @GetMapping
    public HomeMSG getMSG(@RequestParam(defaultValue = "0") int newsPage,
                          @RequestParam(defaultValue = "3") int newsPageSize,
                          @RequestParam(defaultValue = "0") int gameReviewPage,
                          @RequestParam(defaultValue = "10") int gameReviewPageSize){

        Pageable pageableNews = PageRequest.of(newsPage, newsPageSize, Sort.by("date").descending());
        Pageable pageableGameReviews = PageRequest.of(gameReviewPage, gameReviewPageSize, Sort.by("time").descending());

        Page<News> newPageNews = homeService.getNews(pageableNews);
        Page<GameReview> newPageGameReviews = homeService.getGameReviews(pageableGameReviews);

        return new HomeMSG(newPageGameReviews.getContent(), newPageNews.getContent());
    }

    @PostMapping("/login")
    public String login(){
        return "OK";
    }

}
