package com.relevel.foodpanda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeliveryLocation {

    @Id
    private long location_id;
}
