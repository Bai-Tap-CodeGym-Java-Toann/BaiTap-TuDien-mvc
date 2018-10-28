package lanaDrahrepus.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DictionaryImpl implements Dictionary {
    private HashMap<String, String> dictionData = new HashMap<>();

    public DictionaryImpl() {
        dictionData.put("hi","chào");
        dictionData.put("fish","cá");
        dictionData.put("cow","bò");
        dictionData.put("dog","chó");
        dictionData.put("chicken","gà");
    }

    @Override
    public boolean add(String vi, String en) {
        if (dictionData.containsKey(vi))
            return false;
        else
            dictionData.put(vi, en);
        return true;
    }

    @Override
    public boolean remove(String vi) {
        if (dictionData.containsKey(vi)){
            dictionData.remove(vi);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(String vi,String en) {
        if (dictionData.containsKey(vi)){
            dictionData.put(vi,en);
            return true;
        }
        return false;
    }

    @Override
    public String find(String vi) {
        if (dictionData.containsKey(vi)){
            return dictionData.get(vi);
        }
        return "";
    }
}
