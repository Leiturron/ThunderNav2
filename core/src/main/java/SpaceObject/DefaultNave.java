package SpaceObject;

public class DefaultNave extends Nave{
	
	private static DefaultNave instance;
	
	private DefaultNave() {
		this.tex = null;
		this.x = 0;
		this.y = 0;
		this.speed = 10;
		
		this.id = 1;
		this.unlock = true;
		this.destruido = false;
		this.vida = 3;
	}
	
	public static DefaultNave getInstance() {
		if(instance == null) {
			instance = new DefaultNave();
		}
		return instance;
	}
	
}
