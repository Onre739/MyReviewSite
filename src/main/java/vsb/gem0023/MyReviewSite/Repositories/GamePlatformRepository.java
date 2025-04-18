package vsb.gem0023.MyReviewSite.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vsb.gem0023.MyReviewSite.Entities.GamePlatform;

public interface GamePlatformRepository extends JpaRepository<GamePlatform, Integer> {
}
