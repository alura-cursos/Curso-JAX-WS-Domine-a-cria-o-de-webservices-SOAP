
package br.com.caelum.correios.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCServicosCalculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCServicosCalculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cServicosCalculo" type="{http://tempuri.org/}cServicosCalculo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCServicosCalculo", propOrder = {
    "cServicosCalculo"
})
public class ArrayOfCServicosCalculo {

    protected List<CServicosCalculo> cServicosCalculo;

    /**
     * Gets the value of the cServicosCalculo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cServicosCalculo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCServicosCalculo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CServicosCalculo }
     * 
     * 
     */
    public List<CServicosCalculo> getCServicosCalculo() {
        if (cServicosCalculo == null) {
            cServicosCalculo = new ArrayList<CServicosCalculo>();
        }
        return this.cServicosCalculo;
    }

}
