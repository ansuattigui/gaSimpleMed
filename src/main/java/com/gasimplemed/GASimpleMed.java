package com.gasimplemed;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;

public class GASimpleMed extends ParticleApplication {

    public GASimpleMed() {
        super("Gluon Desktop Application");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(GASimpleMed.class.getResource("style.css").toExternalForm());

        setTitle("JDocplus Desktop Version");
        
        getParticle().buildMenu("File -> [exit]", "Help -> [about]");
        
        getParticle().getToolBarActions().addAll(actions("---", "about", "exit"));
    }
}