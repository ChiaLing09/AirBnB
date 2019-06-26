package com.example.airbnb.controllers;

import com.example.airbnb.entities.AirBnBProperty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ApiController
 */
@RestController
@RequestMapping(path = "/api")
public class ApiController {
  @GetMapping(value = "/property", produces = "application/json")
  public AirBnBProperty[] getPropertyList() {
    AirBnBProperty[] properties = {
        new AirBnBProperty(true, true, "Bright, Comfortable Room in Hospitable, Gay Household", 274, "RM", 5, 501),
        new AirBnBProperty(true, true, "Immaculate Architect's Garden Townhouse. Inclusive of Vat.", 365, "RM", 5, 8),
        new AirBnBProperty(true, true, "Chic Room with Bath and Kitchenette Living Area", 439, "RM", 5, 257) };
    return properties;
  }

}