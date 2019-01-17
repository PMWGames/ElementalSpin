//teste Julieta
package com.elementalspin.pmwgames.elementalspin;


import android.content.Context;
import android.util.Log;

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

    private float velocidade_flor_x = 2.5f;
    private float velocidade_flor_y = 3f;
    private float velocidade_rotation = 1f;

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


        nova_flor();
        nova_flor();
        nova_flor();
        nova_flor();
        nova_flor();
        nova_flor();
        nova_flor();
        nova_flor();

        //logo
        logo = createSprite(R.mipmap.dragon, 1, 1);

        //logo.setScreenPercent(90, 90);
        logo.setScreenProportional(context, AGScreenManager.iScreenHeight / 2);



        logo.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 1.5f);

        //botão
        play_button = createSprite(R.mipmap.play_button, 5, 1);

        //play_button.setScreenPercent(25, 25);
        play_button.setScreenProportional(context, AGScreenManager.iScreenHeight / 5);

        play_button.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 4f);
        play_button.addAnimation(4, true, 0, 2);


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
            rotation = flores.get(i).fAngle;

            x = x + velocidade_flor_x;
            y = y - velocidade_flor_y;

            //verifica qual rotação da flor e aumenta ou decrementa º
            if(flores.get(i).iRotationDirection == AGSprite.CLOCKWISE) {
                rotation += velocidade_rotation;
            } else {
                rotation -= velocidade_rotation;
            }

            flores.get(i).vrPosition.setXY(x, y);
            flores.get(i).fAngle = rotation;

            //Verifica se a flor ultrapassa os limites da tela, se sim, reposiciona ela no topo para cair novamente
            if( x > (AGScreenManager.iScreenWidth + AGScreenManager.iScreenHeight / 15 ) ||
                y < -(AGScreenManager.iScreenHeight / 15)){

                reposiciona_flor(flores.get(i));

            }

        }
    }

    private void nova_flor()
    {

        //flor
        flor = createSprite(R.mipmap.flor, 1, 1);

        flor.setScreenProportional(context, AGScreenManager.iScreenHeight / 28);

        int valor_x;
        int valor_y;
        boolean valor_direction;
        Random geradorX = new Random();

        valor_x = geradorX.nextInt(AGScreenManager.iScreenWidth / 2 + (AGScreenManager.iScreenWidth/4));
        valor_y = AGScreenManager.iScreenHeight + geradorX.nextInt(1000); //adicionei esse random para Y para que elas não caiam ela linhas

        //este código serve para sorte a direção de rotação da flor, horário ou anti-horário
        valor_direction = geradorX.nextBoolean();
        if(valor_direction){
            flor.iRotationDirection = AGSprite.CLOCKWISE;
        } else {
            flor.iRotationDirection = AGSprite.COUNTER_CLOCKWISE;
        }

        flor.vrPosition.setXY(valor_x, valor_y);
        flores.add(flor);

    }

    //este método reposiciona uma flor para cair novamente
    private void reposiciona_flor(AGSprite flor){

        int valor_x;
        int valor_y;
        boolean valor_direction;
        Random geradorX = new Random();

        valor_x = geradorX.nextInt(AGScreenManager.iScreenWidth / 2 + (AGScreenManager.iScreenWidth/4));
        valor_y = AGScreenManager.iScreenHeight + geradorX.nextInt(1000); //adicionei esse random para Y para que elas não caiam ela linhas

        //este código serve para sorte a direção de rotação da flor, horário ou anti-horário
        valor_direction = geradorX.nextBoolean();
        if(valor_direction){
            flor.iRotationDirection = AGSprite.CLOCKWISE;
        } else {
            flor.iRotationDirection = AGSprite.COUNTER_CLOCKWISE;
        }

        flor.vrPosition.setXY(valor_x, valor_y);

    }

}
