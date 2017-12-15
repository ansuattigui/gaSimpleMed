/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gasimplemed.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;

/**
 * FXML Controller class
 *
 * @author Ralfh
 */

public class SimpleOptionsController  {
    
    @Inject ParticleApplication app;    
    @Inject private ViewManager viewManager;
    @Inject private StateManager stateManager;
        
    private boolean first = true;

    
//    @FXML public Accordion menuPrincipal;
//    @FXML public TitledPane tpaneAgenda;
    @FXML public Button btnAgenda;
    @FXML public Button btnPacientes;

    private Action actionOptions;
    
    public void initialize() {
        ActionMap.register(this);
        actionOptions =  ActionMap.action("opcoes");        
//        button.setOnAction(e -> viewManager.switchView("secondary"));        
    }

    public void postInit() {
        if (first) {
            stateManager.setPersistenceMode(StateManager.PersistenceMode.USER);
            
//            addUser(stateManager.getProperty("UserName").orElse("").toString());
            first = false;
        }
        app.getParticle().getToolBarActions().add(0, actionOptions);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionOptions);
    }
    
    
    @FXML
    public void agenda(ActionEvent event) throws IOException {        
/*        CdiContext context = CdiContext.INSTANCE;
        AgendaController controller = context.getBean(AgendaController.class);                
        Stage stage = new Stage();
        stage.setTitle("Simple");
        stage.setScene(controller.sceneShow(null));
        stage.initOwner(primaryStage);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();*/
    }    

    @FXML
    public void pacientes(ActionEvent event) throws IOException {        
/*        CdiContext context = CdiContext.INSTANCE;
        PacienteController controller = context.getBean(PacienteController.class);                
        Stage stage = new Stage();
        stage.setTitle("Simple");
        stage.setScene(controller.sceneShow(null));
        stage.initOwner(primaryStage);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show(); */
    }    
    
}
