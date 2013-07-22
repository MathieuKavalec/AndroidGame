package com.gca.testgame;

import com.gca.framework.Screen;
import com.gca.framework.implementation.AndroidGame;

public class TestGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
    
    @Override
    public void onBackPressed() {
    	getCurrentScreen().backButton();
    }
    
    
}
