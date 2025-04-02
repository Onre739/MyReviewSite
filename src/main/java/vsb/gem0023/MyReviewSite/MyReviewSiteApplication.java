package vsb.gem0023.MyReviewSite;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vsb.gem0023.MyReviewSite.Entities.User;

import java.time.LocalDateTime;

@Log4j2
@SpringBootApplication
public class MyReviewSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyReviewSiteApplication.class, args);

	}

}
