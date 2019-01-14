package com.elementalspin.pmwgames.elementalspin.AndGraph;

import java.util.ArrayList;

public class AGText {

    private String text = null;
    private float r, g, b, a;
    private AGSprite pixel = null;
    private ArrayList<AGSprite> lst_pixels = null;
    private AGScene scene = null;
    private int cod_image;
    private int pos_x;
    private int pos_y;
    private int size;

    public AGText(AGScene scene, int cod_imagem){

        this.scene = scene;
        this.setCodImage(cod_imagem);
        this.lst_pixels = new ArrayList<>();
        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.a = 0;
        this.setSize(10);
        this.setPosX(0);
        this.setPosY(0);
        this.setText("");

    }

    public void write(){

        for(int i = 0; i < this.text.length(); i++){

            int[][] letter = getArrayLetter(this.text.toLowerCase().charAt(i));
            int max_x = letter[0].length;
            int max_y = letter.length;

            for(int j = 0; j < max_y; j++){

                for(int k = 0; k < max_x; k++){

                    if(letter[j][k] == 1){

                        this.lst_pixels.add(this.pixel);

                       // this.lst_pixels.get(i) = this.scene.createSprite(this.cod_image, 1, 1);
                        this.lst_pixels.get(i).setScreenPercent(this.size, this.size);
                        this.lst_pixels.get(i).vrPosition.setY(this.pos_y);
                      //  this.lst_pixels.get(i).vrPosition.setX();
                    }

                }

            }

        }

    }

    public void setTextColor(int r, int g, int b, int a){

        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCodImage() {
        return cod_image;
    }

    public void setCodImage(int cod_image) {
        this.cod_image = cod_image;
    }

    public int getPosX() {
        return pos_x;
    }

    public void setPosX(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPosY() {
        return pos_y;
    }

    public void setPosY(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    private int[][] getArrayLetter(char letter){

        int[][] arr_letter = null;

        switch (letter){

            case 'a':

                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case 'b':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {1, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case 'c':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case 'd':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case 'e':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case 'f':
                arr_letter = new int[][]{
                        {0, 0, 1},
                        {0, 1, 0},
                        {1, 1, 1},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 0, 0},
                        {0, 0, 0},
                };
                break;

            case 'g':
                arr_letter = new int[][]{
                        {0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},

                };
                break;
            case 'h':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'i':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'j':
                arr_letter = new int[][]{
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                };
                break;
            case 'k':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 1, 0},
                        {1, 0, 1, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 0, 1, 0, 0},
                        {1, 0, 1, 0, 0},
                        {1, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'l':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'm':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 1, 1, 1, 1, 0},
                        {1, 1, 0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0 ,0},
                };
                break;
            case 'n':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'o':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'p':
                arr_letter = new int[][]{
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {1, 0, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'q':
                arr_letter = new int[][]{
                        {0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'r':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 's':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 't':
                arr_letter = new int[][]{
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 1, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'u':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'v':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'w':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 0, 1, 0, 0, 1},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                };
                break;
            case 'x':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'y':
                arr_letter = new int[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;
            case 'z':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '0':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '1':
                arr_letter = new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 1, 1, 0, 0},
                        {1, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '2':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '3':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '4':
                arr_letter = new int[][]{
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 1, 0},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 1, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '5':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 1},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '6':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '7':
                arr_letter = new int[][]{
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '8':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case '9':
                arr_letter = new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
                break;

            case ':':
                arr_letter = new int[][]{
                        {0},
                        {0},
                        {1},
                        {0},
                        {0},
                        {0},
                        {0},
                        {1},
                        {0},
                        {0},
                };
                break;

            case '.':
                arr_letter = new int[][]{
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {1},
                        {0},
                        {0},
                };
                break;
/*
            case '.':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                };
                break;
            case '.':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                };
                break;
            case '.':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                };
                break;
            case '.':
                arr_letter = new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                };
                break;
*/





            default:
                arr_letter = new int[][]{
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                };
                break;


        }

        return arr_letter;

    }

}