package com.joshua.ordermanagement.model;

public class DetallePedido {
    private Long idDetalle;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private Double precioUnitario;
    private Double subTotal;

    public DetallePedido() {
    }

    public DetallePedido(Long idDetalle, Pedido pedido, Producto producto, int cantidad, Double precioUnitario, Double subTotal) {
        this.idDetalle = idDetalle;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public  void calcularSubTotal(){
        Double sub = 0.0;
        sub = precioUnitario * cantidad;

        this.subTotal = sub;
    }
    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "idDetalle=" + idDetalle +
                ", pedido=" + pedido +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subTotal=" + subTotal +
                '}';
    }
}
