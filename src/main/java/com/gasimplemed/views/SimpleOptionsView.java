package com.gasimplemed.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.gasimplemed.controllers.SimpleOptionsController;

@ParticleView(name = "simpleOptions", isDefault = true)
public class SimpleOptionsView extends FXMLView {
    
    public SimpleOptionsView() {
        super(SimpleOptionsView.class.getResource("simpleoptions.fxml"));
    }
    
    @Override
    public void start() {
        ((SimpleOptionsController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((SimpleOptionsController) getController()).dispose();
    }
    
}
