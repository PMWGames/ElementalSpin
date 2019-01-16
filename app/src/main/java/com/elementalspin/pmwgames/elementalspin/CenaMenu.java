//teste Julieta
package com.elementalspin.pmwgames.elementalspin;


import android.content.Context;

import com.elementalspin.pmwgames.elementalspin.AndGraph.AGGameManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScene;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGScreenManager;
import com.elementalspin.pmwgames.elementalspin.AndGraph.AGSprite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CenaMenu extends AGScene {

//    private AGSprite bg = null;

    private AGSprite background = null;
    private AGSprite logo = null;
    private AGSprite play_button = null;

    private Context context = null;
    private List<AGSprite> flores = new ArrayList<AGSprite>();
    private AGSprite flor = null;

    private float velocidade_flor_x = 2f;
    private float velocidade_flor_y = 1f;
    private float velocidade_rotation = 0.05f;

    public CenaMenu(AGGameManager pManager, Context context) {

        super(pManager);

        this.context = context;

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

       // background.setScreenPercent( 100, 100);
        background.setScreenProportional(context, AGScreenManager.iScreenHeight);

        background.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2);

        //flor
        flor = createSprite(R.mipmap.flor, 1, 1);

        flor.setScreenProportional(context, AGScreenManager.iScreenHeight / 15);

//        flor.vrPosition.setXY(AGScreenManager.iScreenWidth / 2.9f, AGScreenManager.iScreenHeight / 1.2f);

        nova_flor();
//        nova_flor();
//        nova_flor();

        //logo
        logo = createSprite(R.mipmap.dragon, 1, 1);

        //logo.setScreenPercent(90, 90);
        logo.setScreenProportional(context, AGScreenManager.iScreenHeight / 2);



        logo.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 1.5f);

        //botão
        play_button = createSprite(R.mipmap.play_button, 1, 1);

        //play_button.setScreenPercent(25, 25);
        play_button.setScreenProportional(context, AGScreenManager.iScreenHeight / 8);

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
        for(int i = 0; i < flores.size(); i++)
        {
            float x, y, rotation;
            x = flores.get(i).vrPosition.getX();
            y = flores.get(i).vrPosition.getY();
//            rotation = flores.get(i).

            x = x + velocidade_flor_x;
            y = y - velocidade_flor_y;

            flores.get(i).vrPosition.setXY(x, y);

        }
    }

    private void nova_flor()
    {
        int valor_x = 0;
        Random geradorX = new Random();

        valor_x = geradorX.nextInt(200);


        flor.vrPosition.setXY(valor_x, AGScreenManager.iScreenHeight);
        flores.add(flor);
    }
}
