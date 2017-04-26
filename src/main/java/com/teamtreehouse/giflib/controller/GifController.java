package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by scott on 4/24/2017.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> gifs= gifRepository.getAllGifs();
        modelMap.put("gifs",gifs);
        return "home";
    }
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelmap){
        Gif gif = gifRepository.findByName(name);
        modelmap.put("gif",gif);
        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String favorites(ModelMap map){
        List<Gif> favs = gifRepository.findFavorites();
        map.put("favorites",favs);
        return "favorites";
    }

    @RequestMapping("/search")
    public String search(@RequestParam String search, ModelMap map){
        List<Gif> res = gifRepository.searchByName(search);
        map.put("results",res);
        return "results";
    }



}
