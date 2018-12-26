//teste Julieta
package com.elementalspin.pmwgames.elementalspin;


import com.elementalspin.pmwgames.elementalspin.AndGraph.AGGameManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScene;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScreenManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGSprite;

public class CenaMenu extends AGScene {

    private AGSprite bg = null;

    public CenaMenu(AGGameManager pManager) {

        super(pManager);

    }

    @Override
    public void init() {

        //apenas teste de funcionamento
        this.bg = createSprite(R.drawable.star_field_test, 1, 1);
        this.bg.setScreenPercent(200, 140);
        this.bg.vrPosition.setX(AGScreenManager.iScreenWidth / 2);
        this.bg.vrPosition.setY(AGScreenManager.iScreenHeight / 2);

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
