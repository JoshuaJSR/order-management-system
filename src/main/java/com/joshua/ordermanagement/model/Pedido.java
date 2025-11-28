package com.joshua.ordermanagement.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private Long idPedido;
    private LocalDate fecha;
    private Double total;
    private Cliente cliente;
    private List<DetallePedido> detalles = new ArrayList<>();
    public Pedido() {
    }

    public Pedido(Long idPedido, LocalDate fecha, Double total, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total = 0.0;
        this.cliente = cliente;
    }
    public void calcularTotal(){
        Double total = 0.0;
        for(DetallePedido d: detalles){
            total = d.getSubTotal();
        }
        this.total = total;
    }
    public void agregarDetalle(DetallePedido detalle){
        this.detalles.add(detalle);
    }
    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", fecha=" + fecha +
                ", total=" + total +
                ", cliente=" + cliente +
                '}';
    }
}
