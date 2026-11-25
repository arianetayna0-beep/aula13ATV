package com.senai.aula13compnuvemapi.Models;

public class Produto {

    //Atributos do produto

    private  int id;
    private  String nome;
    private int quantidade;
    private double preco;

    public Produto() {
    }

    // Construtor

    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco) {
        this(id, nome, 0, preco);
    }


    // Getters para pegar o id
    public  int getId(){
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return  preco;
    }


    
}