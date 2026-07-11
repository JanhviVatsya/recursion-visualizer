package com.recursionvisualizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.recursionvisualizer.dto.VisualizationRequest;
import com.recursionvisualizer.dto.VisualizationResponse;
import com.recursionvisualizer.service.VisualizationService;

@RestController
@RequestMapping("/api")
public class VisualizationController {

    @Autowired
    private VisualizationService visualizationService;

    @PostMapping("/visualize")
    public ResponseEntity<VisualizationResponse> visualize(
            @RequestBody VisualizationRequest request) {

        return ResponseEntity.ok(
                visualizationService.visualize(request));

    }

}