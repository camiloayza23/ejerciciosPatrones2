package visitor;

public interface IVisitor {
	public String visit (Gato gato);
	public String visit (Perro perro);
	public String visit (Caballo caballo);
}
