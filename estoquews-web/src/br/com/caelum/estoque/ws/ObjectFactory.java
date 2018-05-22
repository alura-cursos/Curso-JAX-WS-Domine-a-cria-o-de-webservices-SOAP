
package br.com.caelum.estoque.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarItemResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "CadastrarItemResponse");
    private final static QName _TodosOsItensResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "TodosOsItensResponse");
    private final static QName _TokenUsuario_QNAME = new QName("http://ws.estoque.caelum.com.br/", "tokenUsuario");
    private final static QName _CadastrarItem_QNAME = new QName("http://ws.estoque.caelum.com.br/", "CadastrarItem");
    private final static QName _Filtros_QNAME = new QName("http://ws.estoque.caelum.com.br/", "filtros");
    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws.estoque.caelum.com.br/", "AutorizacaoFault");
    private final static QName _ListaItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listaItens");
    private final static QName _TodosOsItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "TodosOsItens");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link TodosOsItens }
     * 
     */
    public TodosOsItens createTodosOsItens() {
        return new TodosOsItens();
    }

    /**
     * Create an instance of {@link CadastrarItem }
     * 
     */
    public CadastrarItem createCadastrarItem() {
        return new CadastrarItem();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link CadastrarItemResponse }
     * 
     */
    public CadastrarItemResponse createCadastrarItemResponse() {
        return new CadastrarItemResponse();
    }

    /**
     * Create an instance of {@link TodosOsItensResponse }
     * 
     */
    public TodosOsItensResponse createTodosOsItensResponse() {
        return new TodosOsItensResponse();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "CadastrarItemResponse")
    public JAXBElement<CadastrarItemResponse> createCadastrarItemResponse(CadastrarItemResponse value) {
        return new JAXBElement<CadastrarItemResponse>(_CadastrarItemResponse_QNAME, CadastrarItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "TodosOsItensResponse")
    public JAXBElement<TodosOsItensResponse> createTodosOsItensResponse(TodosOsItensResponse value) {
        return new JAXBElement<TodosOsItensResponse>(_TodosOsItensResponse_QNAME, TodosOsItensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "tokenUsuario")
    public JAXBElement<TokenUsuario> createTokenUsuario(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_TokenUsuario_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "CadastrarItem")
    public JAXBElement<CadastrarItem> createCadastrarItem(CadastrarItem value) {
        return new JAXBElement<CadastrarItem>(_CadastrarItem_QNAME, CadastrarItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "AutorizacaoFault")
    public JAXBElement<String> createAutorizacaoFault(String value) {
        return new JAXBElement<String>(_AutorizacaoFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "TodosOsItens")
    public JAXBElement<TodosOsItens> createTodosOsItens(TodosOsItens value) {
        return new JAXBElement<TodosOsItens>(_TodosOsItens_QNAME, TodosOsItens.class, null, value);
    }

}
