package com.tcs.UnitManagmentService.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

}
