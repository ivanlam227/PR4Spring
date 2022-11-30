package com.example.Rabota.Models;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Pattern(regexp ="^[а-яА-ЯёЁa-zA-Z0-9]+$", message = " В марке используйте английские, русские буквы и цифры")
    private String marks;
    @Min(10000)
    @Max(99999999)
    @NotNull(message = "Минимальная цена 10000")

    private Double sale;


   @Min(6)
    @Max(7)
   @NotNull(message = "номер двигателя состоит из 6-7 цифр")
    private Integer numberengen;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
@NotNull(message = "Заполните поле")
    private Date year;
    @NotEmpty(message = "Заполните поле")
    @Size(max=25)
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Integer getNumberengen() {
        return numberengen;
    }

    public void setNumberengen(Integer numberengen) {
        this.numberengen = numberengen;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }
}
