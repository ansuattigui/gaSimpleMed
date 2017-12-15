package com.gasimplemed.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.inject.Inject;
import org.controlsfx.control.action.ActionProxy;

@ParticleActions
public class MenuActions {

    @Inject ParticleApplication app;

    @ActionProxy(text="Sair", accelerator="alt+F4")
    private void sair() {
        app.exit();
    }
    
    @ActionProxy(text="Sobre",longText = "Sobre o GASimpleMed")
    private void sobre() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GASimpled Desktop");
        alert.setHeaderText("Sobre o GASimpleMed");
        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/icon.png").toExternalForm(), 48, 48, true, true)));
        alert.setContentText("Este é um aplicativo para gerenciamento de agenda de consultas e "
                + "informações de pacientes");
        alert.showAndWait();
    }
        
}