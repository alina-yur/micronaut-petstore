package com.example;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public enum PetType {
    DOG,
    CAT,
    FISH,
    RABBIT,
    HAMSTER
}