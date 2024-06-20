package com.googlecode.hotire.springdatajpa.inheritance.strategies.table_per_class;

import javax.persistence.Entity;

import lombok.Data;


@Data
@Entity
public class TablePerClassA extends TablePerClass {
    private String nameA;
}
