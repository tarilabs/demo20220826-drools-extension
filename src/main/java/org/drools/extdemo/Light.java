package org.drools.extdemo;

public class Light {
    private String name;
    private Boolean powered;

    public Light() {

    }
    public Light(String name, Boolean powered) {
        this.name = name;
        this.powered = powered;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getPowered() {
        return powered;
    }
    public void setPowered(Boolean powered) {
        this.powered = powered;
    }
    @Override
    public String toString() {
        return "Light [name=" + name + ", powered=" + powered + "]";
    }
}
