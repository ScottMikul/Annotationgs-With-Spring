package com.teamtreehouse.giflib.data;


import java.util.Arrays;
import java.util.List;
import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;


/**
 * Created by scott on 4/25/2017.
 */
@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"technology"),
            new Category(2,"exploding"),
            new Category(3,"people")
    );

    public Category findById(int id){
        for(Category cat : ALL_CATEGORIES){
            if(cat.getId()==id){
                return cat;
            }

        }
        return null;
    }

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

}
