package com.evalueytor.empresa.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data//EXTENDS PARA HERENCIA
public class Proveedor extends Empresa{
  private Long calificacion;
}
