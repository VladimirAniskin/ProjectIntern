package com.intern.calorienormalizer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
public class User {

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

  public void setPurpose(PurposeStatus purpose) {
    this.purpose = purpose.getValue();
  }

  public PurposeStatus getPurpose() {
    return PurposeStatus.fromValue(purpose);
  }

}
