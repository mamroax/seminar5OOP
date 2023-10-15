package view;


import java.util.List;

public class View{

    public void printDetails(List list){
        for (Object object:list){
            System.out.println(object);
        }
    }
}
