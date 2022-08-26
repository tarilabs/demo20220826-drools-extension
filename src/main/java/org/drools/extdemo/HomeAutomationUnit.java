package org.drools.extdemo;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class HomeAutomationUnit implements RuleUnitData {
    
    private boolean presentAtHome;
    private DataStore<Light> lights;

    public HomeAutomationUnit(){
        this(false, DataSource.createStore());
    }
    public HomeAutomationUnit(boolean presentAtHome, DataStore<Light> lights) {
        this.presentAtHome = presentAtHome;
        this.lights = lights;
    }
    public boolean isPresentAtHome() {
        return presentAtHome;
    }
    public void setPresentAtHome(boolean presentAtHome) {
        this.presentAtHome = presentAtHome;
    }
    public DataStore<Light> getLights() {
        return lights;
    }
    public void setLights(DataStore<Light> lights) {
        this.lights = lights;
    }
}
