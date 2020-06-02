package com.github.maquirag.enni.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MainLayout extends AppLayout {

    public MainLayout() {
        createMenuBar();
    }

    private void createMenuBar() {
        Button homeLink = new Button(new Icon(VaadinIcon.HOME));
        homeLink.addClickListener(evt ->
                homeLink.getUI().ifPresent(ui -> ui.navigate(DashboardView.class)));
        ((Icon) homeLink.getIcon()).setColor("darkgreen");

        Button calendarLink = new Button("History", new Icon(VaadinIcon.CALENDAR));
        calendarLink.addClickListener(evt -> Notification.show("History not implemented yet"));
        ((Icon) calendarLink.getIcon()).setColor("firebrick");

        Button mealLink = new Button("Meals", new Icon(VaadinIcon.CUTLERY));
        mealLink.addClickListener(evt -> Notification.show("Meals not implemented yet"));
        ((Icon) mealLink.getIcon()).setColor("darkorange");

        Button ingredientLink = new Button("Ingredients", new Icon(VaadinIcon.CLUSTER));
        ingredientLink.addClickListener(evt -> Notification.show("Ingredients not implemented yet"));
        ((Icon) ingredientLink.getIcon()).setColor("darkviolet");

        HorizontalLayout menubar = new HorizontalLayout(homeLink, calendarLink, mealLink, ingredientLink);
        menubar.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        menubar.addClassName("menubar");
        addToNavbar(menubar);
    }
}
