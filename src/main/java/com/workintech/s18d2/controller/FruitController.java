package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
public class FruitController {
private  final FruitService fruitService;





@GetMapping
    public List<Fruit> get() {
    return  fruitService.getByPriceAsc();
}



    @GetMapping("/desc")
    public Fruit get(@PathVariable("id") Long id) {
        return  fruitService.getById(id);
    }

    @GetMapping("/name/{name]")
    public List<Fruit> getByName(@Positive @PathVariable("name") String name) {
        return  fruitService.searchByName(name);
    }




    @PostMapping
    public  Fruit save(@RequestBody Fruit fruit) {
    return fruitService.save(fruit);
    }



    @DeleteMapping("/{id}")
    public  Fruit delete(@NonNull @Positive @PathVariable Long id){
    return fruitService.delete(id);
    }

}
