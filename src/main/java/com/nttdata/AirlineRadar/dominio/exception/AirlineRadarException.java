package com.nttdata.AirlineRadar.dominio.exception;

import java.io.Serial;

public class AirlineRadarException extends RuntimeException {
  @Serial private static final long serialVersionUID = 1042095602243573863L;

  public AirlineRadarException(final String message) {
    super(message);
  }
}
