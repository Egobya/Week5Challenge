package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import org.w3c.dom.stylesheets.LinkStyle;
import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Long>{
        /*default List<Pet> findAL()
        {
            return null;
        }*/

}



