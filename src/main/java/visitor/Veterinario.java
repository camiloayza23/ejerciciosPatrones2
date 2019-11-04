package visitor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Veterinario implements IVisitor{

	@Override
	public String visit(Gato gato) {
			if (gato.getEnfermedad1() != null) {
				gato.setCura("Necesita una vacuna");  
				gato.setTime(hora());
				return "El diagnostico es que el gato tiene " + gato.getEnfermedad1() +": \n\t " + gato.getCura() + ". \n\t Hora y fecha de diagnostico: " + gato.getTime();
			}
			
			if (gato.getEnfermedad2() != null) {
				gato.setCura("Necesita un analisis");  
				gato.setTime(hora());
				return "El diagnostico es que el gato tiene " + gato.getEnfermedad2() +": \n\t " + gato.getCura() + ". \n\t Hora y fecha de diagnostico: " + gato.getTime();			
			}
			
			if (gato.getEnfermedad3() != null) {
				gato.setCura("Necesita una operacion");  
				gato.setTime(hora());
				return "El diagnostico es que el gato tiene " + gato.getEnfermedad3() + ": \n\t " + gato.getCura() + ". \n\t Hora y fecha de diagnostico: " + gato.getTime();
			}
						
			return "El gato no Necesita ninguna cura";
	}

	@Override
	public String visit(Perro perro) {
		if (perro.getEnfermedad1() != null) {
			perro.setCura("Necesita una vacuna");  
			perro.setTime(hora());
			return "El diagnostico es que el perro tiene " + perro.getEnfermedad1()+": \n\t " + perro.getCura() + ". \n\t Hora y fecha de diagnostico: " + perro.getTime();
		}
		
		if (perro.getEnfermedad2() != null) {
			perro.setCura("Necesita un analisis");  
			perro.setTime(hora());
			return "El diagnostico es que el perro tiene "+ perro.getEnfermedad2()+": \n\t " + perro.getCura() + ". \n\t Hora y fecha de diagnostico: " + perro.getTime();			
		}
		
		if (perro.getEnfermedad3() != null) {
			perro.setCura("Necesita una operacion");  
			perro.setTime(hora());
			return "El diagnostico es que el perro tiene "+ perro.getEnfermedad3()+ ": \n\t " + perro.getCura() + ". \n\t Hora y fecha de diagnostico: " + perro.getTime();
		}
					
		return "El perro no Necesita ninguna cura";
	}

	@Override
	public String visit(Caballo caballo) {
		if (caballo.getEnfermedad1() != null) {
			caballo.setCura("Necesita una vacuna");  
			caballo.setTime(hora());
			return "El diagnostico es que el caballo tiene "+ caballo.getEnfermedad1() +": \n\t " + caballo.getCura() + ". \n\t Hora y fecha de diagnostico: " + caballo.getTime();
		}
		
		if (caballo.getEnfermedad2() != null) {
			caballo.setCura("Necesita un analisis");  
			caballo.setTime(hora());
			return "El diagnostico es que el caballo tiene " +caballo.getEnfermedad2()+": \n\t " + caballo.getCura() + ". \n\t Hora y fecha de diagnostico: " + caballo.getTime();			
		}
		
		if (caballo.getEnfermedad3() != null) {
			caballo.setCura("Necesita una operacion");  
			caballo.setTime(hora());
			return "El diagnostico es que el caballo tiene "+caballo.getEnfermedad3()+": \n\t " + caballo.getCura() + ". \n\t Hora y fecha de diagnostico: " + caballo.getTime();
		}
					
		return "El caballo no Necesita ninguna cura";

	}
	
	public String hora() {
		LocalDateTime now = LocalDateTime.now();  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		String formatDateTime = now.format(format);
		return formatDateTime;
	}

}
