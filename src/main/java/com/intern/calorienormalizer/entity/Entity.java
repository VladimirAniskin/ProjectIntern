package com.intern.calorienormalizer.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@jakarta.persistence.Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entity")
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Integer age;

    private Integer weight;

    private Integer height;
    private String floor;

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private Integer purpose;

    public void setPurpose(PurposeStatus purposeStatus) {
        purpose = purposeStatus.getValue();
    }

    public PurposeStatus getPurpose() {

        return PurposeStatus.fromValue(purpose);
    }

}
