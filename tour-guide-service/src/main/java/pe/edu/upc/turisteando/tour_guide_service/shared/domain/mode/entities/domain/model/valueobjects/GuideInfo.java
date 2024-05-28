package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
public record GuideInfo(List<String> languages, String specializations, List<String> certifications, double rate) {
    // Método para verificar si el guía está certificado en una especialización específica
    public boolean isCertifiedInSpecialization(String specialization) {
        return certifications.contains(specialization);
    }

    // Método para actualizar la tasa del guía
    public GuideInfo updateRate(double newRate) {
        return new GuideInfo(languages, specializations, certifications, newRate);
    }
}
