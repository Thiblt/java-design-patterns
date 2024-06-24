package fr.diginamic.service;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationService {
	public static double calculateTotal(Client client,int nbPlaces, TypeReservation type) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			return total*(1-type.getReductionPourcent()/100.0);
		}
		else {
			return total;
		}
	}

}
