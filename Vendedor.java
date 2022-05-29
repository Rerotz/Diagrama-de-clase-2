
package capanegocio;


public class Vendedor {
    private char codVendedor;
    private String nombreVendedor;
    private String celularVendedor;
    public RegistroVenta suscribeRegistroVenta;

    public char getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(char codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
    }
    
    
}
