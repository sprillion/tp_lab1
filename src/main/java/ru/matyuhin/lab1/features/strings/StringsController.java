package ru.matyuhin.lab1.features.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class StringsController {

    private ArrayList<String> stringArrayList;
    private HashMap<String, String> stringHashMap;

    public void updateArrayList(String s){
        if (stringArrayList == null)
        {
            stringArrayList = new ArrayList<>();
            return;
        }
        stringArrayList.add(s);
    }

    public ArrayList<String> getArrayList(){
        return stringArrayList;
    }

    public void updateHashMap(String s){
        if (stringHashMap == null)
        {
            stringHashMap = new HashMap<>();
            return;
        }
        var id = UUID.randomUUID().toString();
        stringHashMap.put(id, s);
    }

    public HashMap<String, String> getHashMap(){
        return stringHashMap;
    }

    public AllLengthResponseRemote getAllLength(){
        var arrayListCount = 0;
        var hashMapCount = 0;
        if (stringArrayList != null)
        {
            arrayListCount = stringArrayList.size();
        }
        if (stringHashMap != null)
        {
            hashMapCount = stringHashMap.size();
        }
        return new AllLengthResponseRemote(arrayListCount, hashMapCount);
    }
}
