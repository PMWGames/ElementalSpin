package com.elementalspin.pmwgames.elementalspin;

import android.os.Bundle;

import com.elementalspin.pmwgames.elementalspin.AndGraph.AGActivityGame;

public class MainActivity extends AGActivityGame {

    private CenaMenu cena_menu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.init(this, false);

        criaCenas();

        adicionaCenas();

    }


    private void criaCenas() {
        //método responsável por instanciar as cenas
        this.cena_menu = new CenaMenu(this.getGameManager());

    }

    private void adicionaCenas() {
        //método responsável por adicionar as cenas na lista de cenas
        this.getGameManager().addScene(this.cena_menu);

    }

}
