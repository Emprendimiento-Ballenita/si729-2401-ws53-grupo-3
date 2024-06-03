package pe.edu.upc.inscription.turisteando_platform.inscription.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record TouristPreferences(String type, String location, String season) {
}
