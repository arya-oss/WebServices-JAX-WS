
package com.rahackya.ccassign.soapapp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rahackya.ccassign.soapapp package. 
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

    private final static QName _SayHelloResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "sayHelloResponse");
    private final static QName _DestroyUserResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "destroyUserResponse");
    private final static QName _EditUser_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "editUser");
    private final static QName _Show_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "show");
    private final static QName _ShowAllResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "showAllResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "addUserResponse");
    private final static QName _DestroyUser_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "destroyUser");
    private final static QName _EditUserResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "editUserResponse");
    private final static QName _SayHello_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "sayHello");
    private final static QName _ShowAll_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "showAll");
    private final static QName _ShowResponse_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "showResponse");
    private final static QName _AddUser_QNAME = new QName("http://soapapp.ccassign.rahackya.com/", "addUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rahackya.ccassign.soapapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowResponse }
     * 
     */
    public ShowResponse createShowResponse() {
        return new ShowResponse();
    }

    /**
     * Create an instance of {@link DestroyUser }
     * 
     */
    public DestroyUser createDestroyUser() {
        return new DestroyUser();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link ShowAll }
     * 
     */
    public ShowAll createShowAll() {
        return new ShowAll();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link DestroyUserResponse }
     * 
     */
    public DestroyUserResponse createDestroyUserResponse() {
        return new DestroyUserResponse();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link Show }
     * 
     */
    public Show createShow() {
        return new Show();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link ShowAllResponse }
     * 
     */
    public ShowAllResponse createShowAllResponse() {
        return new ShowAllResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "destroyUserResponse")
    public JAXBElement<DestroyUserResponse> createDestroyUserResponse(DestroyUserResponse value) {
        return new JAXBElement<DestroyUserResponse>(_DestroyUserResponse_QNAME, DestroyUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Show }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "show")
    public JAXBElement<Show> createShow(Show value) {
        return new JAXBElement<Show>(_Show_QNAME, Show.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "showAllResponse")
    public JAXBElement<ShowAllResponse> createShowAllResponse(ShowAllResponse value) {
        return new JAXBElement<ShowAllResponse>(_ShowAllResponse_QNAME, ShowAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "destroyUser")
    public JAXBElement<DestroyUser> createDestroyUser(DestroyUser value) {
        return new JAXBElement<DestroyUser>(_DestroyUser_QNAME, DestroyUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "showAll")
    public JAXBElement<ShowAll> createShowAll(ShowAll value) {
        return new JAXBElement<ShowAll>(_ShowAll_QNAME, ShowAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "showResponse")
    public JAXBElement<ShowResponse> createShowResponse(ShowResponse value) {
        return new JAXBElement<ShowResponse>(_ShowResponse_QNAME, ShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapapp.ccassign.rahackya.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

}
