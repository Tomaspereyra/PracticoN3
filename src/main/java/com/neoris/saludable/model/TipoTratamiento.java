package com.neoris.saludable.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;

@JsonDeserialize(using = EnumDeserializer.class)
public enum TipoTratamiento {
ANOREXIA,
BULIMIA,
OBESIDAD
}
