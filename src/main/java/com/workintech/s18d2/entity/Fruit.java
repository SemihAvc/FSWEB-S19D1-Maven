package com.workintech.s18d2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "frurit", schema = "fsweb")
public class Fruit  extends Plant{



}
