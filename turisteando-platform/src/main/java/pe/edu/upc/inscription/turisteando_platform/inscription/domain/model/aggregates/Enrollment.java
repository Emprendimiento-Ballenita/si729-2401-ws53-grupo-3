package pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.valueobjects.EnrollmentStatus;

import java.util.Date;

@Getter
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Enrollment extends AbstractAggregateRoot<Enrollment> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private EnrollmentStatus status;

    @Getter
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Getter
    @ManyToOne
    @JoinColumn(name = "tourist_trip_id")
    private TouristTrip touristTrip;

    @CreatedDate
    private Date inscriptedAt;
}
