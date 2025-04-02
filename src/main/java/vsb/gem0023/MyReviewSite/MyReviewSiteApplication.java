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

		//User u = new User("ASD", "Adssd", "ASDSDS", "dsdsd", LocalDateTime.of(2001, 9, 12, 2, 4, 1));
		//log.info(u.toString());

	}

}
