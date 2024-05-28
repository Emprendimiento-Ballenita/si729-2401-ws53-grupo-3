package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record UserInfo(String firstname, String lastname, String email, String phone, String address) {
    // Método para validar el formato del correo electrónico
    public boolean isValidEmail() {
        // Implementación de la lógica de validación del correo electrónico
        assert email != null;
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    // Método para validar el formato del número de teléfono
    public boolean isValidPhone() {
        // Implementación de la lógica de validación del número de teléfono
        assert phone != null;
        return phone.matches("\\d{10}");
    }

    // Método para obtener el nombre completo
    public String getFullName() {
        return firstname + " " + lastname;
    }

    // Constructor con validación de datos
    public UserInfo {
        if (!isValidEmail()) {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        }
        if (!isValidPhone()) {
            throw new IllegalArgumentException("El número de teléfono no es válido");
        }
    }
}
