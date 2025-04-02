package vsb.gem0023.MyReviewSite.Messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import vsb.gem0023.MyReviewSite.Entities.DLCReview;
import vsb.gem0023.MyReviewSite.Entities.GameReview;
import vsb.gem0023.MyReviewSite.Entities.News;

import java.util.List;

@Data
@AllArgsConstructor
public class HomeMSG {
    private List<GameReview> gameReviews;
    private List<DLCReview> dlcReviews;
    private List<News> news;
}
