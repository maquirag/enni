package com.github.maquirag.enni;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("enni"),
                new H3("ENhanced Nutrition Insights"));

        Div attribution = new Div(
                new Text("Icons made by "),
                new Anchor("https://www.flaticon.com/authors/freepik", "Freepik"),
                new Text(" from "),
                new Anchor("https://www.flaticon.com/", "Flaticon"));
        attribution.addClassName("attribution");
        add(attribution);
    }

}
