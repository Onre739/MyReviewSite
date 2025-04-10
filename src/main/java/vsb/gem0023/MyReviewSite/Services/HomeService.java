package vsb.gem0023.MyReviewSite.Services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vsb.gem0023.MyReviewSite.Entities.GameReview;
import vsb.gem0023.MyReviewSite.Entities.News;
import vsb.gem0023.MyReviewSite.Repositories.GameReviewRepository;
import vsb.gem0023.MyReviewSite.Repositories.NewsRepository;

@Data
@Service
public class HomeService {
    private NewsRepository newsRepository;
    private GameReviewRepository gameReviewRepository;

    @Autowired
    public HomeService(NewsRepository newsRepository, GameReviewRepository gameReviewRepository){
        this.newsRepository = newsRepository;
        this.gameReviewRepository = gameReviewRepository;
    }

    public Page<News> getNews(Pageable pageable){
        return newsRepository.findAll(pageable);
    }

    public Page<GameReview> getGameReviews(Pageable pageable){
        return gameReviewRepository.findAll(pageable);
    }
}
