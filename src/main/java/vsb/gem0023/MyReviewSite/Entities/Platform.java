package vsb.gem0023.MyReviewSite.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "platform")
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "platform", cascade = CascadeType.ALL)
    private List<GamePlatform> game_platforms;

    @OneToMany(mappedBy = "platform", cascade = CascadeType.ALL)
    private List<DLCPlatform> dlc_platforms;
}
