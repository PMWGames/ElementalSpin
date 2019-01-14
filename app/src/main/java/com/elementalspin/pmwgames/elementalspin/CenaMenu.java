//teste Julieta
package com.elementalspin.pmwgames.elementalspin;


import com.elementalspin.pmwgames.elementalspin.AndGraph.AGGameManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScene;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScreenManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGSprite;

public class CenaMenu extends AGScene {

//    private AGSprite bg = null;

    AGSprite background = null;
    AGSprite logo = null;
    AGSprite play_button = null;

    public CenaMenu(AGGameManager pManager) {

        super(pManager);

    }

    @Override
    public void init() {

//        //apenas teste de funcionamento
//        this.bg = createSprite(R.drawable.star_field_test, 1, 1);
//        this.bg.setScreenPercent(200, 140);
//        this.bg.vrPosition.setX(AGScreenManager.iScreenWidth / 2);
//        this.bg.vrPosition.setY(AGScreenManager.iScreenHeight / 2);


        //fundo
        background = createSprite(R.mipmap.backgroud, 1, 1);

        background.setScreenPercent( 100, 100);

        background.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2);

        //logo
        logo = createSprite(R.mipmap.dragon, 1, 1);

        logo.setScreenPercent(70, 60);

        logo.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 1.5f);

        //botão
        play_button = createSprite(R.mipmap.play_button, 1, 1);

        play_button.setScreenPercent(25, 8);

        play_button.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 4f);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

    }
}
