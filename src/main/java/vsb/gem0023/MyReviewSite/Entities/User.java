package vsb.gem0023.MyReviewSite.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    private LocalDateTime last_update;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<GameReview> game_reviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DLCReview> dlc_reviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<News> news;
}
