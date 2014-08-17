/**
 */
package SimpleBPMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleBPMN.Event#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends FlowObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SimpleBPMN.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SimpleBPMN.EventType
	 * @see #setType(EventType)
	 * @see SimpleBPMN.SimpleBPMNPackage#getEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link SimpleBPMN.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SimpleBPMN.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

} // Event
