package visitor;

public interface IEnfermedad {
	public String accept(IVisitor visitor);
	public String getEnfermedad1();
	public String getEnfermedad2();
	public String getEnfermedad3();
	public void setEnfermedad1(String e1);
	public void setEnfermedad2(String e2);
	public void setEnfermedad3(String e3);
}
