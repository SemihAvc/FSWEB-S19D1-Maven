package com.workintech.s18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PostRemove;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegatable", schema = "fsweb")
public class Vegetable  extends  Plant{


    @Column(name = "is_GrownOn_Tree" )

    private boolean isGrownOnTree;
}
