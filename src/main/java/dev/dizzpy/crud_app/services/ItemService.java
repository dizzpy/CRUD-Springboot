package dev.dizzpy.crud_app.services;

import dev.dizzpy.crud_app.models.Item;
import dev.dizzpy.crud_app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item itemDetails) {
        itemDetails.setId(id);
        return itemRepository.save(itemDetails);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
