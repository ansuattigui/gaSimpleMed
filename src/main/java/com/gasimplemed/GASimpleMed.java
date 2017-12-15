package com.gasimplemed;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;

public class GASimpleMed extends ParticleApplication {

    public GASimpleMed() {
        super("Gestão de Informações Médicas");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(GASimpleMed.class.getResource("style.css").toExternalForm());

        setTitle("JDocplus Versão Desktop");
        
        getParticle().buildMenu("Arquivo -> [sair]", "Ajuda -> [sobre]");
        
        getParticle().getToolBarActions().addAll(actions("---", "sobre", "sair"));
    }
}