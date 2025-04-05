package vsb.gem0023.MyReviewSite.Services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vsb.gem0023.MyReviewSite.Entities.Game;
import vsb.gem0023.MyReviewSite.Entities.GameReview;
import vsb.gem0023.MyReviewSite.Repositories.GameRepository;
import vsb.gem0023.MyReviewSite.Repositories.GameReviewRepository;

import java.util.Optional;

@Data
@Service
public class GameService {

    private GameRepository gameRepository;
    private GameReviewRepository gameReviewRepository;

    @Autowired
    public GameService(GameRepository gameRepository, GameReviewRepository gameReviewRepository){
        this.gameRepository = gameRepository;
        this.gameReviewRepository = gameReviewRepository;
    }

    public Optional<Game> findGameById(Integer id){
        return gameRepository.findById(id);
    }

    public Page<GameReview> findGameReviewsByGameId(int id, Pageable pageable){
        return gameReviewRepository.findByGameId(id, pageable);
    }

}
