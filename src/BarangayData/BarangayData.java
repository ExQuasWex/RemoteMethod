package BarangayData;

import PriorityModels.PriorityLevel;
import PriorityModels.PriorityType;

import java.io.Serializable;

/**
 * Created by reiner on 2/29/2016.
 */
public class BarangayData implements Serializable {

    String barangayName;
    int unresolvePopulation, resolvePopulation;
    int  population;
    PriorityLevel priorityLevel;
    PriorityType priorityType;
    int histories;

    public int getHistories() {
        return histories;
    }

    public void setHistories(int histories) {
        this.histories = histories;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BarangayData(String barangayName, int population,  int unresolvePopulation, int resolvePopulation, PriorityLevel priorityLevel, PriorityType priorityType) {
        this.barangayName = barangayName;
        this.unresolvePopulation = unresolvePopulation;
        this.resolvePopulation = resolvePopulation;
        this.priorityLevel = priorityLevel;
        this.priorityType = priorityType;
    }

    public BarangayData(){

    }

    public String getBarangayName() {
        return barangayName;
    }

    public void setBarangayName(String barangayName) {
        this.barangayName = barangayName;
    }

    public int getUnresolvePopulation() {
        return unresolvePopulation;
    }

    public void setUnresolvePopulation(int unresolvePopulation) {
        this.unresolvePopulation = unresolvePopulation;
    }

    public int getResolvePopulation() {
        return resolvePopulation;
    }

    public void setResolvePopulation(int resolvePopulation) {
        this.resolvePopulation = resolvePopulation;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public PriorityType getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(PriorityType priorityType) {
        this.priorityType = priorityType;
    }
}
