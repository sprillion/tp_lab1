package ru.matyuhin.lab1.features.strings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class StringsRouting {

    private final StringsController stringsController = new StringsController();

    @GetMapping("/update-array")
    public void updateArrayList(@RequestParam(value = "string", defaultValue = "") String s){
        stringsController.updateArrayList(s);
    }

    @GetMapping("/show-array")
    public ArrayList<String> showArrayList(){
        return stringsController.getArrayList();
    }

    @GetMapping("/update-map")
    public void updateHashMap(@RequestParam(value = "string", defaultValue = "") String s){
        stringsController.updateHashMap(s);
    }

    @GetMapping("/show-map")
    public HashMap<String, String> showHashMap(){
        return stringsController.getHashMap();
    }

    @GetMapping("/show-all-length")
    public AllLengthResponseRemote showAllLength(){
        return stringsController.getAllLength();
    }
}
