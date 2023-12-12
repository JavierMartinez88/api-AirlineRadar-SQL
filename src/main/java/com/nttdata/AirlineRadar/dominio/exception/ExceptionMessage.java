package com.nttdata.AirlineRadar.dominio.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionMessage {
  TABLE_CREATION("Unexpected error generating data model");

  private final String message;
}
