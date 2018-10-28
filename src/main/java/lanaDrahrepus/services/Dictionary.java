package lanaDrahrepus.services;

import java.util.ArrayList;

public interface Dictionary {
    public boolean add(String vi, String en);

    public boolean remove(String vi);

    public boolean update(String vi, String en);
    public String find(String vi);
}
