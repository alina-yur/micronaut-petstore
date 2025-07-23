package com.example;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Serdeable
@MappedEntity("pet_items")
public record PetItem(
        @Id @GeneratedValue(GeneratedValue.Type.AUTO) @Nullable Long id,

        @NonNull @NotBlank @Size(max = 100) String name,

        @NonNull @NotNull @DecimalMin(value = "0.01", message = "Price must be greater than 0") BigDecimal price,

        @NonNull @NotNull @Min(value = 0, message = "Stock amount cannot be negative") Integer stockAmount,

        @NonNull @NotNull PetType petType,

        @Nullable @Size(max = 500) String description) {

    public PetItem(String name, BigDecimal price, Integer stockAmount, PetType petType, String description) {
        this(null, name, price, stockAmount, petType, description);
    }

    public boolean isInStock() {
        return stockAmount != null && stockAmount > 0;
    }

    public PetItem withStockAmount(Integer newStockAmount) {
        return new PetItem(id, name, price, newStockAmount, petType, description);
    }
}