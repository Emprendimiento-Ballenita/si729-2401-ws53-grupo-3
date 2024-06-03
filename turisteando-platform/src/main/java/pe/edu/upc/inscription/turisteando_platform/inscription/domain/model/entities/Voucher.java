package pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.entities;

import jakarta.persistence.*;
import pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.aggregates.Enrollment;

@Entity
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voucherID;

    @Column(nullable = false)
    private double discountAmount;

}
