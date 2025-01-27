package Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.AlphaAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.utils.ScreenUtils;

import io.github.FirstGame.testGame.ThunderShip;

public class MainMenuScreen implements Screen{
	
	private ThunderShip game;
	private SpriteBatch batch;
	private BitmapFont font;
	private Stage stage;
	private Texture fondo;
	private Image fondoImage;
	private Image blackImage;
	private Music music;
	private ImageButton playButton;
	private ImageButton skinButton;
	private ImageButton quitButton;
	private Texture playTex;
	private Texture skinTex;
	private Texture quitTex;
	private float alpha;
	
	public MainMenuScreen(ThunderShip game) {
		
		this.alpha = 1;
		
		//Juego principal y herramientas
		this.game = game;
		this.batch = game.getBatch();
		this.font = game.getFont();
		
		//Stage
		this.stage = new Stage();

		//Crear fondo negro para hacer fade in
		this.fondo = new Texture(Gdx.files.internal("menuFondo.png"));
		fondoImage = new Image(fondo);
		
		blackImage = new Image(fondo);
		blackImage.setColor(Color.BLACK);
		AlphaAction fadeOut = Actions.fadeOut(alpha);
		blackImage.addAction(fadeOut);
		
		//agregar los fondos al stage
		stage.addActor(fondoImage);      
		stage.addActor(blackImage);
		
		//Musica fondo
		this.music = Gdx.audio.newMusic(Gdx.files.internal("menuMusic.mp3"));
	}
	

	public void show() {
		
	}

	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		music.play();
		stage.act();
		stage.draw();
		
		


	}

	public void resize(int width, int height) {
		
		
	}

	public void pause() {
		
	}

	public void resume() {
		
	}


	public void hide() {
		
	}

	public void dispose() {
		stage.dispose();
	}

}
