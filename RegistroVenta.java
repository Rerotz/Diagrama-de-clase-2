
package capanegocio;
import java.util.ArrayList;

public class RegistroVenta {
    private char codRegistro;
    private String fechaHoraRegistro;
    private Double PrecioRegistro;
    public Cliente registraCliente;
    public Automovil consignaAutomovil;
    public Vendedor tieneVendedor; 
    public ArrayList <Mantenimiento> tieneMantenimiento = new ArrayList();

    public char getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(char codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public Double getPrecioRegistro() {
        return PrecioRegistro;
    }

    public void setPrecioRegistro(Double PrecioRegistro) {
        this.PrecioRegistro = PrecioRegistro;
    }
    
}
