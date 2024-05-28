package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.aggregates.TourTrip;

import java.util.Date;
import java.util.List;

@Getter
@Entity
public class BoucherTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_trip_id", referencedColumnName = "id")
    private List<TourTrip> trips;

    @NotNull
    private Date issueDate; // Fecha de emisión de la boleta

    @NotNull
    private double totalAmount; // Monto total de la boleta

    @NotNull
    private String paymentMethod; // Método de pago utilizado (efectivo, tarjeta, etc.)

    @NotNull
    private String currency; // Moneda utilizada para el pago (soles, dólares, euros, etc.)
}
