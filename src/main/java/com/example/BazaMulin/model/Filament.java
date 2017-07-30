package com.example.BazaMulin.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by marcin on 30.07.17.
 */
@Table(name = "FILAMENT")
@Entity
public class Filament extends AbstractPersistable<Long> {


    @Column(name = "FILAMENT_CODENAME", nullable = false)
    @NotNull
    @NotEmpty(message = "Pole nie może być puste")
    @Pattern(regexp = "[0-9]{4}", message = "Wymagane cztery cyfry")
    private String filamentCodename;


    @Column(name = "QUANTITY",nullable = false)
    @NotNull
    @NotEmpty(message = "Pole nie może być puste")
    @Pattern(regexp = "[0-9]", message = "Wymagane cyfry")
    private String quantity;

    public Filament(String filamentCodename, String quantity) {
        this.filamentCodename = filamentCodename;
        this.quantity = quantity;
    }

    public Filament() {
    }

    public String getFilamentCodename() {
        return filamentCodename;
    }

    public void setFilamentCodename(String filamentCodename) {
        this.filamentCodename = filamentCodename;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Filament filament = (Filament) o;

        if (filamentCodename != null ? !filamentCodename.equals(filament.filamentCodename) : filament.filamentCodename != null)
            return false;
        return quantity != null ? quantity.equals(filament.quantity) : filament.quantity == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filamentCodename != null ? filamentCodename.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Filament{" +
                "filamentCodename='" + filamentCodename + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
