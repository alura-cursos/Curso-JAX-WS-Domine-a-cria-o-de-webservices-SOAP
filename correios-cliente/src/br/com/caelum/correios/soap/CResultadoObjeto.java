
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cResultadoObjeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cResultadoObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Objetos" type="{http://tempuri.org/}ArrayOfCObjeto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultadoObjeto", propOrder = {
    "objetos"
})
public class CResultadoObjeto {

    @XmlElement(name = "Objetos")
    protected ArrayOfCObjeto objetos;

    /**
     * Gets the value of the objetos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCObjeto }
     *     
     */
    public ArrayOfCObjeto getObjetos() {
        return objetos;
    }

    /**
     * Sets the value of the objetos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCObjeto }
     *     
     */
    public void setObjetos(ArrayOfCObjeto value) {
        this.objetos = value;
    }

}
