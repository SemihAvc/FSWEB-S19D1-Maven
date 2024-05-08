package com.workintech.s18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import javax.naming.ldap.PagedResultsControl;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Plant {

  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
  @Column(name = "id")
    private  long id;

    @Column(name = "name")
    @NotNull
@Size(min = 2 , max = 45 , message = "Dostum isim alanını boş bırakma... Düzgün gir...")
    private  long name;



  @Column(name = "price")
  @NotNull
  @DecimalMin("10")
  private  long price;


}
