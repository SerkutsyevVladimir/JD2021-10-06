package by.it.brutski.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if(Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("Привет");
        }catch (NumberFormatException | NullPointerException exc){
           // Class<TaskA> currentClass = TaskA.class;
            ExceptonInfo exceptonInfo = new ExceptonInfo(exc, TaskA.class);
            String info = exceptonInfo.getInfo();
            System.out.println(info);
        }
    }
}
