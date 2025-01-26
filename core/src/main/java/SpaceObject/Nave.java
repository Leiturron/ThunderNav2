package SpaceObject;

public abstract class Nave extends SpaceObject{
	//Datos
	protected byte id;               //id del nave
	protected boolean unlock;        //Si esta desbloqueado
	
	//Estados
	protected boolean destruido;     //Si esta destruido
	protected int vida;              //Vida actual
	
	public void unlocked() {
		this.unlock = true;
	}
}
