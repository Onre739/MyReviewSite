package vsb.gem0023.MyReviewSite.Controllers;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vsb.gem0023.MyReviewSite.Entities.Game;
import vsb.gem0023.MyReviewSite.Messages.SearchMSG;
import vsb.gem0023.MyReviewSite.Services.GameService;

@Data
@Log4j2
@RestController
@RequestMapping(path = "/search")
public class SearchController {
    private GameService gameService;

    @Autowired
    public SearchController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping
    public SearchMSG getMSG(@RequestParam String query,
                         @RequestParam(defaultValue = "0") int page,
                         @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());

        Page<Game> newPage = gameService.findGamesByName(query, pageable);

        System.out.println("String: " + query + "; page: " + page + "; size: " + size);

        SearchMSG newMSG = new SearchMSG(newPage.getContent(), newPage.getTotalPages());
        log.info(newMSG.toString());

        return newMSG;
    }

}
