
package capanegocio;


public class Mantenimiento {
    private char codMantenimiento;
    private String fechaMantenimiento;
    private Double precioMantenimiento;
    private String descripcionMantenimiento;
    public RegistroVenta correspondeRegistroVenta;

    public char getCodMantenimiento() {
        return codMantenimiento;
    }

    public void setCodMantenimiento(char codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }

    public String getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(String fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public Double getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(Double precioMantenimiento) {
        this.precioMantenimiento = precioMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }
    
}
