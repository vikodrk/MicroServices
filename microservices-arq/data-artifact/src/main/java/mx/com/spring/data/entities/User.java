package mx.com.spring.data.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity(name = "USUARIOS")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1373023793412344197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;

	@Basic
	@Column(name = "NOM_USUARIO")
	private String nombreUsuario;

	@Basic
	@Column(name = "TIPO_USUARIO")
	private Integer tipoUsuario;

	@Basic
	@Column(name = "FECHA_ALTA")
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;

	@Basic
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	@Basic
	@Column(name = "BLOQUEADO")
	private Boolean locked;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Date getFechaAlta() {
		return fechaAlta != null ? (Date) fechaAlta.clone() : null;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta != null ? (Date) fechaAlta.clone() : null;
	}

	public Date getFechaModificacion() {
		return fechaModificacion != null ? (Date) fechaModificacion.clone() : null;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion != null ? (Date) fechaModificacion.clone() : null;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null && obj.getClass() == this.getClass()) {

			if (this == obj) {
				flag = true;
			}

			else {
				flag = new EqualsBuilder().append(idUsuario, ((User) obj).idUsuario).isEquals();
			}

		}
		return flag;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(idUsuario);
		return builder.toHashCode();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.idUsuario).append(" - ");
		builder.append(this.nombreUsuario).append(" -- ").append(this.locked);
		return builder.toString();
	}

}
