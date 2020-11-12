package frsf.isi.died.guia08.problema01.modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Empleado {

	public enum Tipo { CONTRATADO,EFECTIVO}; 
	
	private Integer cuil;
	private String nombre;
	private Tipo tipo;
	private Double costoHora;
	private List<Tarea> tareasAsignadas;
	
	private Function<Tarea, Double> calculoPagoPorTarea;		
	private Predicate<Tarea> puedeAsignarTarea;

// bug encontrado. 			inciso 2F
	
	public Double salario() {

		return 0.0;
	}
	
	/**
	 * Si la tarea ya fue terminada nos indica cuaal es el monto según el algoritmo de calculoPagoPorTarea
	 * Si la tarea no fue terminada simplemente calcula el costo en base a lo estimado.
	 * @param t
	 * @return
	 */
	public Double costoTarea(Tarea t) {
		return 0.0;
	}
		
	public Boolean asignarTarea(Tarea t) {
		return false;
	}
	
	public void comenzar(Integer idTarea) {

	}
	
	public void finalizar(Integer idTarea) {

	}

	public void comenzar(Integer idTarea,String fecha) {

	}
	
	public void finalizar(Integer idTarea,String fecha) {

	}
}
