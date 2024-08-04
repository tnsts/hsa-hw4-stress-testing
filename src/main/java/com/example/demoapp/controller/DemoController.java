package com.example.demoapp.controller;

import com.example.demoapp.entity.Record;
import com.example.demoapp.repo.RecordRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final RecordRepository repository;

    public DemoController(RecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/records")
    public ResponseEntity<List<Record>> getAllRecords() {
        List<Record> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/records")
    public ResponseEntity<Record> saveRecord(@RequestParam String value) {
        Record result = repository.save(new Record(value));
        return ResponseEntity.ok(result);
    }
}
