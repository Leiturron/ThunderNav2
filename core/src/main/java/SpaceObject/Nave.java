package SpaceObject;

public abstract class Nave extends SpaceObject{
	//Datos
	protected byte id;               //id del nave
	protected String name;           //nombre del nave
	protected boolean unlock;        //Si esta desbloqueado
	
	//Estados
	protected boolean destruido;     //Si esta destruido
	protected int vida;              //Vida actual
	
	public void unlocked() {
		this.unlock = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
