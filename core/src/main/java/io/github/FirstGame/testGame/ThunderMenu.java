package io.github.FirstGame.testGame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class ThunderMenu extends Game {
	
    private SpriteBatch batch;
    private BitmapFont font;
    private User usuario;

    @Override
    public void create() {
        batch = new SpriteBatch();
        usuario = User.getInstance();
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(usuario.getChoose().getTex(), 0, 0);
        batch.end();
    }

    @Override
    public void dispose() {
        
    }
}
