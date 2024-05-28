package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.aggregates;

import jakarta.persistence.*;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.entities.TuristicDestination;

import javax.print.attribute.standard.Destination;

@Entity
@Table(name = "tourist_trip")
public class TourTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "guide_id", referencedColumnName = "id")
    private Guide guide;

    @ManyToOne
    @JoinColumn(name = "tourist_id", referencedColumnName = "id")
    private Tourist tourist;

    @OneToOne
    @JoinColumn(name = "destination_id", referencedColumnName = "id")
    private TuristicDestination destination;
}
