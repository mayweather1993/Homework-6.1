package Prototype;

import java.util.List;

/**
 * Created by Zver on 10.07.2017.
 */
public class BmwCarProject implements Copyable{
    private String nameProject;
    private int idOfProject;
    private String typeOfCar;
    private List<String> componentParts;

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public int getIdOfProject() {
        return idOfProject;
    }

    public void setIdOfProject(int idOfProject) {
        this.idOfProject = idOfProject;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public List<String> getComponentParts() {
        return componentParts;
    }

    public void setComponentParts(List<String> componentParts) {
        this.componentParts = componentParts;
    }

    public BmwCarProject(String nameProject, int idOfProject, String typeOfCar, List<String> componentParts) {

        this.nameProject = nameProject;
        this.idOfProject = idOfProject;
        this.typeOfCar = typeOfCar;
        this.componentParts = componentParts;
    }

    @Override
    public String toString() {
        return "BmwCarProject{" +
                "nameProject='" + nameProject + '\'' +
                ", idOfProject=" + idOfProject +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", componentParts=" + componentParts +
                '}';
    }

    @Override
    public Copyable copy() {
        return new BmwCarProject(nameProject , idOfProject , typeOfCar , componentParts);
    }
}
