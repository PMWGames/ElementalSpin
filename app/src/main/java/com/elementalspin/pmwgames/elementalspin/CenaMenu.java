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
    AGSprite button = null;

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

        background = createSprite(R.mipmap.backgroud, 1, 1);

        background.setScreenPercent( 100, 100);

        background.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2);
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
