package com.recursionvisualizer.service;

import org.springframework.stereotype.Service;

import com.recursionvisualizer.dto.VisualizationRequest;
import com.recursionvisualizer.dto.VisualizationResponse;

@Service
public class VisualizationService {

	public VisualizationResponse visualize(
            VisualizationRequest request) {

        return new VisualizationResponse(
                "Code received successfully");

    }

}