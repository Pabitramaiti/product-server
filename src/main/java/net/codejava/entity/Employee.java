package net.codejava.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emploee")
@Entity
public class Employee {
    @Id
    @Column
    @NotNull
    private int id;

    @Column
    @NotEmpty
    private String firstName;

    @Column
    private String lastName;

    @Column
    @Min(value = 18)
    @Max(value = 55)
    private int age;

    @Column
    @NotNull
    private double salary;
    
}
