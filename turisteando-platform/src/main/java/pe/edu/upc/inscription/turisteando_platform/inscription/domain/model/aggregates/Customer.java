package pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.aggregates;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.valueobjects.TouristPreferences;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private TouristPreferences touristPreferences;
}
