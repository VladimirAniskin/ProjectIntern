package com.intern.calorienormalizer.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum PurposeStatus {
  LOSE_WEIGHT(1),
  MAINTAIN_WEIGHT(2),
  GAIN_WEIGHT(3);

  private final int value;

  PurposeStatus(int purpose) {
    this.value = purpose;
  }

  public static PurposeStatus fromValue(int value) {
    for (var purpose : values()) {
      if (purpose.getValue() == value) {
        return purpose;
      }
    }
    throw new IllegalArgumentException("Неверное значение индекса для enum OrderStatus");
  }
}
