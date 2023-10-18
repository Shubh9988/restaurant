package com.Anish.Anish.Restaurant.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/restaurants")
    @RequiredArgsConstructor
    @Validated
    public class RestaurantController {

        private final List<Restaurant> restaurantList = new ArrayList<>();

        @GetMapping("/{id}")
        public ResponseEntity<String> getRestaurantById(@PathVariable @Min(1) Long id) {
            Restaurant restaurant = findRestaurantById(id);
            if (restaurant != null) {
                return ResponseEntity.ok(restaurant+" "+"Added in Restaurant");
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @GetMapping
        public ResponseEntity<List<Restaurant>> getAllRestaurants() {
            return ResponseEntity.ok(restaurantList);
        }

        @PostMapping
        public ResponseEntity<Restaurant> addRestaurant(@Valid @RequestBody Restaurant restaurant) {
            restaurantList.add(restaurant);
            return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Restaurant> updateSpecialty(@PathVariable @Min(1) Long id,@RequestParam String newSpecialty) {
            Restaurant restaurant = findRestaurantById(id);
            if (restaurant != null) {
                restaurant.setSpeciality(newSpecialty);
                return ResponseEntity.ok(restaurant);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteRestaurant(@PathVariable @Min(1) Long id) {
            Restaurant restaurant = findRestaurantById(id);
            if (restaurant != null) {
                restaurantList.remove(restaurant);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        private Restaurant findRestaurantById(Long id) {
            return restaurantList.stream()
                    .filter(r -> r.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }
    }
