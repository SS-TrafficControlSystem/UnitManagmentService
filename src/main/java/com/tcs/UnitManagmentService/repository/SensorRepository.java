package com.tcs.UnitManagmentService.repository;

import com.tcs.UnitManagmentService.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
