package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.aggregates;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.UserCredentials;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects.UserInfo;

import java.util.Date;

@Getter
@Entity
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private UserCredentials credentials;

    @Embedded
    private UserInfo userGuide;

    @NotNull
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @NotNull
    private String nationality;
}
