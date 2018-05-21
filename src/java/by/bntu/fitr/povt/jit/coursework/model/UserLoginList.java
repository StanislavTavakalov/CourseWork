
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class UserLoginList implements Iterable<String>{

    private static UserLoginList instance;
    private List<String> userLoginList;

    private UserLoginList() {
        userLoginList = new ArrayList<>();
    }

     public static UserLoginList getInstance(){
        if(instance == null){
            instance = new UserLoginList();
        }
        return instance;
    }

    public List<String> getUserLoginList() {
        return userLoginList;
    }

    public void setUserLoginList(List<String> userLoginList) {
        this.userLoginList = userLoginList;
    }
    
    public int size() {
        return userLoginList.size();
    }

    public boolean isEmpty() {
        return userLoginList.isEmpty();
    }

    @Override
    public Iterator<String> iterator() {
        return userLoginList.iterator();
    }

    public boolean add(String e) {
        return userLoginList.add(e);
    }

    public void sort(Comparator<? super String> c) {
        userLoginList.sort(c);
    }

    public String remove(int index) {
        return userLoginList.remove(index);
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        userLoginList.forEach(action);
    }

    @Override
    public String toString() {
        return "UserLoginList{" + "userLoginList=" + userLoginList + '}';
    }

    public boolean remove(String o) {
        return userLoginList.remove(o);
    }

    public String get(int index){
        return userLoginList.get(index);
    }
    

}
