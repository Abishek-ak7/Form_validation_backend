package backend.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(length = 10)
    private String employeeId;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Pattern(regexp = "\\d{10}")
    private String phoneNumber;

    @NotBlank
    private String department;

    @NotNull
    @PastOrPresent
    private LocalDate dateOfJoining;

    @NotBlank
    private String role;

    // Lombok generates Getters and Setters automatically
}
