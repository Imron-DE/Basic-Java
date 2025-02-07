package day3.Enums;

import java.util.EnumSet;
import java.util.Set;
// ENUM bisa disimpan ke dalam set

public class EnumSetOf {
    enum Menu{
        INDOMIE, PECEL_AYAM, ES_TEH, KOPI
    }

    public static void main(String[] args) {
        // nambahin menu kedalam set
        Set<Menu> availableMenu = EnumSet.of(Menu.INDOMIE, Menu.PECEL_AYAM); // <1>

        // nambahin menu lain
        availableMenu.add(Menu.ES_TEH);

        // dek menu ada ga
        if(availableMenu.contains(Menu.ES_TEH)){
            System.out.println("menu is available");
        } else {
            System.out.println("out of stock");
        }

        System.out.println("Today menu : " + availableMenu);
    }
}
