package dev.dizzpy.crud_app.repository;

import dev.dizzpy.crud_app.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // Custom query methods can be defined here, if needed
}
