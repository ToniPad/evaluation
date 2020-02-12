package fr.organisation;

import java.util.ArrayList;
import java.util.*;

public class Parking {

    private ArrayList<String> vehiculesAutorise = new ArrayList<String>();
    private ArrayList<String> vehiculeSurParking = new ArrayList<String>();
    private int nbPlaceMax;

    public Parking() {
        vehiculesAutorise.clear();
        vehiculeSurParking.clear();
    }

    public boolean ajouterVehiculeAutorisee(String immatriculation) {
        vehiculesAutorise.add(immatriculation);
        if (vehiculeSurParking.contains(immatriculation)) {
            System.out.println("cette voiture est déja dans le parking!");
        }

    }

    public boolean enregistrerVehicule(String immatriculation){
        int nbPlace = vehiculeSurParking.size();
        if (nbPlace < nbPlaceMax){

            vehiculesAutorise.add(immatriculation);
        }
}
    public boolean departVehicule(String immatriculation) {
        int nbPlace = vehiculeSurParking.size();
        if (vehiculeSurParking.contains(immatriculation)) {

            vehiculesAutorise.remove(immatriculation);
        }
    }
    public boolean vehiculePresent(String immatriculation) {
        int nbPlace = vehiculeSurParking.size();
        if (vehiculeSurParking.contains(immatriculation)) {

            System.out.println("véhicule présent");
        }
    }
    public boolean parkingPlein(String immatriculation) {
        int nbPlace =  nbPlaceMax;
        if (vehiculeSurParking.contains(immatriculation)) {

            System.out.println("parking plein");
        }
    }
    public boolean nbVehiculepresent(String immatriculation) {
        int 
    }

}