package com.tcs.UnitManagmentService.controller;

import com.tcs.UnitManagmentService.model.Sensor;
import com.tcs.UnitManagmentService.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SensorController {

    private final SensorRepository sensorRepository;

    @GetMapping("/sensors")
    public List<Sensor> getAllCustomers() {
        return sensorRepository.findAll();
    }

    @GetMapping("/sensors/{id}")
    public Sensor getById(@PathVariable Long id) {
        return sensorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sensor Not Found"));
    }
}
