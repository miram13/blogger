package org.acme;

import javax.persistence.Entity;

import javax.persistence.Column;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
@Entity
public class Blog extends PanacheEntity {
    @Column
    public String author = "IRAMM";
    @Column
    public String name = "Automation";

}