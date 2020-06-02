package com.github.maquirag.enni.ui;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("enni | Dashboard")
public class DashboardView extends VerticalLayout {

    public DashboardView() {
        add(new H1("enni"), new H2("ENhanced Nutrition Insights"));

        Div attribution = new Div(
                new Text("Icons made by "),
                new Anchor("https://www.flaticon.com/authors/freepik", "Freepik"),
                new Text(" from "),
                new Anchor("https://www.flaticon.com/", "Flaticon"));
        attribution.addClassName("attribution");
        add(attribution);
    }

}
