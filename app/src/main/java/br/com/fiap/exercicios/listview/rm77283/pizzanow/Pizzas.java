package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */
public class Pizzas implements Serializable{

    private int img;
    private String sabor;
    private String valor;
    private int des;
    private String pontuacao;

    public Pizzas(int img, String sabor, String valor, int des, String pontuacao) {
        this.img = img;
        this.sabor = sabor;
        this.valor = valor;
        this.des = des;
        this.pontuacao = pontuacao;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
