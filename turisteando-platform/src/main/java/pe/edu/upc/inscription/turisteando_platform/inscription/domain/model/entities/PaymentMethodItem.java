package pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.entities;

import jakarta.persistence.*;

@Entity
public class PaymentMethodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentMethodID;
}
