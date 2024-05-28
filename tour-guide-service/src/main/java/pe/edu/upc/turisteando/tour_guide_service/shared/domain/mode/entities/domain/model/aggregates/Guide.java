package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.GuideAvailability;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.GuideInfo;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.UserCredentials;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.UserInfo;

@Getter
@Entity
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private GuideAvailability availability;

    @Embedded
    private UserCredentials credentials;

    @Embedded
    private UserInfo userGuide;

    @Embedded
    private GuideInfo guideInfo;
}
