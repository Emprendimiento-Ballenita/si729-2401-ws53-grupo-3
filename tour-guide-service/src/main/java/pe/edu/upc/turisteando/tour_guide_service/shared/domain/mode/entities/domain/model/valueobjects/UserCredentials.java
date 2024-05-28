package pe.edu.upc.turisteando.tour_guide_service.shared.domain.mode.entities.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record UserCredentials(String username, String password) {
    public UserCredentials {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be blank");
        }
        if (username.length() < 5 || username.length() > 20) {
            throw new IllegalArgumentException("Username must be between 5 and 20 characters");
        }
        if (!username.matches("^[a-zA-Z0-9._-]+$")) {
            throw new IllegalArgumentException("Username can only contain alphanumeric characters, dots, underscores, and hyphens");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be blank");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$")) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character");
        }
    }
}
