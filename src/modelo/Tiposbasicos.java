package modelo;
// Generated 20:57:28, 19 de xan. de 2023 by Hibernate Tools 5.6.14.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Tiposbasicos generated by hbm2java
 */
public class Tiposbasicos implements java.io.Serializable {

	private int inte;
	private Long bigint1;
	private Short smallint1;
	private Double float1;
	private Character character1;
	private Byte byte1;
	private Boolean bit1;
	private String stri;
	private Date dateDate;
	private Date timeTime;
	private Date dateTime2;
	private String texto;
	private byte[] binario;
	private BigDecimal bigDecimal;

	public Tiposbasicos() {
	}

	public Tiposbasicos(int inte) {
		this.inte = inte;
	}

	public Tiposbasicos(int inte, Long bigint1, Short smallint1, Double float1, Character character1, Byte byte1,
			Boolean bit1, String stri, Date dateDate, Date timeTime, Date dateTime2, String texto, byte[] binario,
			BigDecimal bigDecimal) {
		this.inte = inte;
		this.bigint1 = bigint1;
		this.smallint1 = smallint1;
		this.float1 = float1;
		this.character1 = character1;
		this.byte1 = byte1;
		this.bit1 = bit1;
		this.stri = stri;
		this.dateDate = dateDate;
		this.timeTime = timeTime;
		this.dateTime2 = dateTime2;
		this.texto = texto;
		this.binario = binario;
		this.bigDecimal = bigDecimal;
	}

	public int getInte() {
		return this.inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public Long getBigint1() {
		return this.bigint1;
	}

	public void setBigint1(Long bigint1) {
		this.bigint1 = bigint1;
	}

	public Short getSmallint1() {
		return this.smallint1;
	}

	public void setSmallint1(Short smallint1) {
		this.smallint1 = smallint1;
	}

	public Double getFloat1() {
		return this.float1;
	}

	public void setFloat1(Double float1) {
		this.float1 = float1;
	}

	public Character getCharacter1() {
		return this.character1;
	}

	public void setCharacter1(Character character1) {
		this.character1 = character1;
	}

	public Byte getByte1() {
		return this.byte1;
	}

	public void setByte1(Byte byte1) {
		this.byte1 = byte1;
	}

	public Boolean getBit1() {
		return this.bit1;
	}

	public void setBit1(Boolean bit1) {
		this.bit1 = bit1;
	}

	public String getStri() {
		return this.stri;
	}

	public void setStri(String stri) {
		this.stri = stri;
	}

	public Date getDateDate() {
		return this.dateDate;
	}

	public void setDateDate(Date dateDate) {
		this.dateDate = dateDate;
	}

	public Date getTimeTime() {
		return this.timeTime;
	}

	public void setTimeTime(Date timeTime) {
		this.timeTime = timeTime;
	}

	public Date getDateTime2() {
		return this.dateTime2;
	}

	public void setDateTime2(Date dateTime2) {
		this.dateTime2 = dateTime2;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public byte[] getBinario() {
		return this.binario;
	}

	public void setBinario(byte[] binario) {
		this.binario = binario;
	}

	public BigDecimal getBigDecimal() {
		return this.bigDecimal;
	}

	public void setBigDecimal(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

}