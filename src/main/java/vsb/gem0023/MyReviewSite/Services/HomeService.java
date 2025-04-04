package vsb.gem0023.MyReviewSite.Services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vsb.gem0023.MyReviewSite.Entities.News;
import vsb.gem0023.MyReviewSite.Repositories.NewsRepository;

@Data
@Service
public class HomeService {
    private NewsRepository newsRepository;

    @Autowired
    public HomeService(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    public Page<News> getNews(Pageable pageable){
        return newsRepository.findAll(pageable);
    }
}
