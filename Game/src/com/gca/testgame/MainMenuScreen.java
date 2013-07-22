package com.gca.testgame;

import java.util.List;

import android.util.Log;
import android.util.LogPrinter;

import com.gca.framework.Game;
import com.gca.framework.Graphics;
import com.gca.framework.Screen;
import com.gca.framework.Input.TouchEvent;


public class MainMenuScreen extends Screen {

	
    public MainMenuScreen(Game game) {
        super(game);
    	
    	android.util.LogPrinter log = new LogPrinter(Log.ERROR, "xD");
    	log.println("LOLOLOLOLOLOL xDxDxDxDxDxDXdXdxT Load le main menu bitch");
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();


        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            
            if (event.type == TouchEvent.TOUCH_UP) {
            	if (inBounds(event, 0, 0, 1920, 1080)) {
            		//START GAME
            		game.setScreen(new GameScreen(game));
            	}
        		Assets.click.play(5.0f);
            }
        }
    }
    
    private boolean inBounds(TouchEvent event, int x, int y, int width, int height) {
        return (event.x > x && event.x < x + width - 1 && event.y > y
                && event.y < y + height - 1);
    }

    @Override
    public void paint(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawScaledImage(Assets.menu, 0, 0, g.getWidth(), g.getHeight(), 0, 0, 
        		Assets.menu.getWidth(), Assets.menu.getHeight());
    }


    @Override
    public void pause() {
    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {
        //Display "Exit Game?" Box


    }
}