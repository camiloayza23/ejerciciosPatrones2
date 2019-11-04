package visitor;

public class Perro implements IEnfermedad {
	
	private String enfermedad1;
	private String enfermedad2;
	private String enfermedad3;
	private String cura;
	private String time;
	
	public String getCura() {
		return cura;
	}

	public void setCura(String cura) {
		this.cura = cura;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String getEnfermedad1() {
		return enfermedad1;
	}

	@Override
	public String getEnfermedad2() {
		return enfermedad2;
	}

	@Override
	public String getEnfermedad3() {
		return enfermedad3;
	}

	@Override
	public void setEnfermedad1(String e1) {
		this.enfermedad1 = e1;
	}

	@Override
	public void setEnfermedad2(String e2) {
		this.enfermedad2 = e2;
	}

	@Override
	public void setEnfermedad3(String e3) {
		this.enfermedad3 = e3;
	}



	@Override
	public String accept(IVisitor visitor) {
		return visitor.visit(this);
	}
	

}
