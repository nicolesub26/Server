package taller.BD.Server;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Socios")
public class Socio {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "C1", length = 10)
    private String celular;
    @Column(name = "N1", length = 15)
    private String nombres;
    @Column(name = "A1", length = 20)
    private String apellidos;
    private String correo;
    private Boolean activo;
    private byte[] foto;
    private Date fechaNacimiento;
    private Date fechaRegistro;
    private String direccion;
    @OneToOne(cascade = CascadeType.REMOVE,optional = true)
    private Usuario usr;
    @OneToMany(mappedBy = "soc")
    Set<Solicitudes> solicitudes;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] fot) {
        foto = fot;
    }
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String ced) {
        celular = ced;
    }

    public Socio() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Socio other = (Socio) obj;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (nombres == null) {
            if (other.nombres != null)
                return false;
        } else if (!nombres.equals(other.nombres))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", nombres=" + nombres + "]";
    }

    public Set<Solicitudes> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Set<Solicitudes> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
