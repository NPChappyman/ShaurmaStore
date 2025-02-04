package com.example.demo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class ShaurmaOrder {
    private static final long serialVersionUID = 1L;
 private Long id;
 private Date placedAt;


    @NotBlank(message="Delivery name is required")
    private String deliveryName;


    @NotBlank(message="Street is required")
    private String deliveryStreet;
    @NotBlank(message="City is required")
    private String deliveryCity;
    @NotBlank(message="State is required")
    private String deliveryState;
    @NotBlank(message="Zip code is required")
    private String deliveryZip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
 message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    private List<Shaurma> shaurma = new ArrayList<>();
    public void addShaurma(Shaurma shaurma) {
        this.shaurma.add(shaurma);
    }
    public List<Shaurma> getShaurma() {
        return shaurma;
    }

    public void setShaurma(List<Shaurma> shaurma) {
        this.shaurma = shaurma;
    }
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryZip() {
        return deliveryZip;
    }

    public void setDeliveryZip(String deliveryZip) {
        this.deliveryZip = deliveryZip;
    }

    public String getccNumber() {
        return ccNumber;
    }

    public void setccNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getccExpiration() {
        return ccExpiration;
    }

    public void setccExpiration(String ccExpiration) {
        this.ccExpiration = ccExpiration;
    }

    public String getccCVV() {
        return ccCVV;
    }

    public void setccCVV(String ccCVV) {
        this.ccCVV = ccCVV;
    }
}
