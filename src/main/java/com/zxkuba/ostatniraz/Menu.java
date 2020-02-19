package com.zxkuba.ostatniraz;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void startGame(){

    }

    public void exit() {

    }


    public List<Menu> getOptions() {
        List<Menu> optionsList = new ArrayList<>();


        return optionsList;
    }

    public static String getName(Menu menu) {
        String zx = menu.getOptions().toString();
        return zx;
    }


}
