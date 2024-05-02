package com.pizzaria.pizzaria.models;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @Column (nullable = false)
    private Timestamp dataHora;


    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false) //id de cliente
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idFornada", nullable = true) //id de fornada
    private Fornada fornada;


    public Pedido() {
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }



    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornada getFornada() {
        return fornada;
    }

    public void setFornada(Fornada fornada) {
        this.fornada = fornada;
    }


}
