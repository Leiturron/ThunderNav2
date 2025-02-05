package Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;

import SpaceObject.CyanDemonNave;
import SpaceObject.DefaultNave;
import SpaceObject.Nave;
import io.github.FirstGame.testGame.ThunderShip;

public class SkinScreen implements Screen {
	
	
	private ThunderShip game;
	private BitmapFont font;
	private SpriteBatch batch;
	private LabelStyle style;
	private Stage stage;
	private Label backTex;
	
	private byte pos;
	private Array<Nave> naveArray;
	private Array<Label> naveNameLabel;
	
	
	public SkinScreen(ThunderShip game) {
		this.game = game;
		this.batch = game.getBatch();
		this.font = game.getFont();
		this.stage = new Stage();
		this.pos = 0;
		this.style = new LabelStyle(font, Color.WHITE);
		
		this.backTex = new Label("Back", style);
		this.backTex.setFontScale(0.5f);
		this.backTex.setPosition(25, 20 - backTex.getHeight() / 4);
		
		this.naveArray = new Array<Nave>();
		addNaveToNaveArray();
		
		this.naveNameLabel = new Array<Label>();
		
		variaOperacion();
		
		registrarListener();
		
		Gdx.input.setInputProcessor(stage);
		
	}
	
	public void show() {
		
		
	}
	
	
	public void render(float delta) {
		ScreenUtils.clear(Color.BLACK);
		stage.act();
		
		batch.begin();
		
		naveArray.get(pos).getImage().draw(batch, 1);
		naveNameLabel.get(pos).draw(batch, 1);
		backTex.draw(batch, 1);
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	private void addNaveToNaveArray() {
		naveArray.add(DefaultNave.getInstance());
		naveArray.add(CyanDemonNave.getInstance());
	}
	
	private void variaOperacion() {
		/*
		 * Este método consiste:
		 * 1. Posiciona las imagenes de cada nave
		 * 2. Iniciar label para mostrar el nombre de cada nave
		 * 3. Agregar los elementos al stage
		 */
		int centerWidth = Gdx.graphics.getWidth() / 2;
		int centerHeight = Gdx.graphics.getHeight() / 2;
		
		for(byte i = 0; i < naveArray.size; i++) {
			Nave nav = naveArray.get(i);
			Actor temp =  nav.getImage();
			
			//Operacion 1:
			temp.setScale(1);
			temp.setPosition(centerWidth - temp.getWidth() / 2, centerHeight - temp.getHeight() / 2);
			
			//Operacion 2:
			Label temp2 =  new Label(nav.getName(), style);
			temp2.setFontScale(0.8f);
			temp2.setPosition(centerWidth - temp2.getWidth() * 2 / 5, centerHeight - temp2.getHeight() / 2 + 250);
			this.naveNameLabel.add(temp2);
			
			//Operacion 3:
			this.stage.addActor(temp);
			this.stage.addActor(temp2);
		}
		
		//Operacion 3-2:
		this.stage.addActor(backTex);
	}
	
	private void registrarListener() {
		stage.addListener(new InputListener(){

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				// TODO Auto-generated method stub
				if(pos == naveArray.size - 1) {
					pos = 0;
				}
				else pos++;
				
				return super.touchDown(event, x, y, pointer, button);
			}
			
		});
		
		backTex.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				game.getClickSound().play();
				backTex.setColor(Color.GRAY);
				return true;
			}

			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				backTex.setColor(Color.WHITE);
				game.setScreen(new MainMenuScreen(game));
				dispose();
				super.touchUp(event, x, y, pointer, button);
			}
			
		});
	}
}
