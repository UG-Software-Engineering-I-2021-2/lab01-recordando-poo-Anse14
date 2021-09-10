package cs.ing.software.lab1.model;

import cs.ing.software.lab1.App;

public class Automovil extends Vehiculo {
	public Automovil (double combustible, double capacidadTanque, double consumo) {
		super(combustible, capacidadTanque, consumo);
	}

	public void recargar(double litros) {
		double currentTankSpace = this.capacidadTanque - this.combustible;
		if(currentTankSpace - litros < 0) {
			App.logger.info("No  se  puede  reabastecer  el  tanque,  esta  lleno\n");
		}
		else {
			this.combustible += litros;
			App.logger.info(String.format("La cantidad de combustible del vehiculo es: %.2f\n", this.combustible));
		}
	}
}
