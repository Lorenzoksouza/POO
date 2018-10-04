package polimorfismo;

public class Cliente {
	
	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Cliente() {
		super();
	}
	
}
