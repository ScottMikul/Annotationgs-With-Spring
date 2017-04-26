package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.CategoryRepository;
import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Category;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Created by scott on 4/25/2017.
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap map){
        List<Category> categories = categoryRepository.getAllCategories();
        map.put("categories",categories);
        return "categories";
    }
    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap map){
        Category category = categoryRepository.findById(id);
        map.put("category",category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        map.put("gifs",gifs);

        return "category";
    }


}
