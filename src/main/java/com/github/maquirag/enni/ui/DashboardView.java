package com.github.maquirag.enni.ui;

import com.github.maquirag.enni.backend.service.AllergenService;
import com.github.maquirag.enni.backend.service.IngredientService;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("enni | Dashboard")
public class DashboardView extends VerticalLayout {

    AllergenService allergenService;
    IngredientService ingredientService;

    public DashboardView(AllergenService allergenService,
                         IngredientService ingredientService) {
        this.allergenService = allergenService;
        this.ingredientService = ingredientService;

        add(new H1("enni"), new H2("ENhanced Nutrition Insights"));
        add(new Paragraph("Number of allergens: " + allergenService.count()));
        add(new Paragraph("Number of ingredients: " + ingredientService.count()));

        // Icon artwork attribution
        Div attribution = new Div(
                new Text("Icons made by "),
                new Anchor("https://www.flaticon.com/authors/freepik", "Freepik"),
                new Text(" from "),
                new Anchor("https://www.flaticon.com/", "Flaticon"));
        attribution.addClassName("attribution");
        add(attribution);
    }

}
