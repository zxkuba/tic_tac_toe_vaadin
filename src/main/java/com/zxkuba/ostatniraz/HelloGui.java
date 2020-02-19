package com.zxkuba.ostatniraz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.StyleSheet;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import com.vaadin.flow.router.Route;


import java.util.List;


@Route("hello")
@StyleSheet("public/css/style.css")
public class HelloGui extends VerticalLayout {

    public HelloGui() {
        Menu menu = new Menu();
        Select<Menu> select = new Select<>();
        ComboBox<String> comboBox = new ComboBox<>();
        Div value = new Div();
        Grid<String> zx = new Grid();



        //Menu of the game
        select.setLabel("Menu");
        List<Menu> optionsList = menu.getOptions();

        // Choose which property from Menu is the presentation value
        select.setItemLabelGenerator(Menu::getName);
        select.setItems(optionsList);

        //Choose X or O
        comboBox.setLabel("Label");
        comboBox.setItems("Kółko", "Krzyżyk");
        comboBox.setClearButtonVisible(true);
        value.setText("Select a value");
        comboBox.addValueChangeListener(event -> {
            if (event.getValue() == null) {
                value.setText("No option selected");
            } else {
                value.setText("Wybrano: " + event.getValue());
            }
        });
        Button buttonStart = new Button("START GAME", new Icon(VaadinIcon.ABACUS));


        add(select, comboBox, value, buttonStart, zx);


    }

}
