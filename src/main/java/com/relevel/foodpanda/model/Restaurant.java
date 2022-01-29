package com.relevel.foodpanda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {

    @Id
    private long restaurant_id;
}
