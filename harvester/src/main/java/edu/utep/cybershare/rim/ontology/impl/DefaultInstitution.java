package edu.utep.cybershare.rim.ontology.impl;

import edu.utep.cybershare.rim.ontology.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultInstitution <br>
 * @version generated on Fri Jun 13 12:09:56 GMT-07:00 2014 by nick
 */
public class DefaultInstitution extends WrappedIndividualImpl implements Institution {

    public DefaultInstitution(OWLOntology ontology, IRI iri) {
        super(ontology, iri);
    }





    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasAddress
     */
     
    public Collection<? extends String> getHasAddress() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASADDRESS, String.class);
    }

    public boolean hasHasAddress() {
		return !getHasAddress().isEmpty();
    }

    public void addHasAddress(String newHasAddress) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASADDRESS, newHasAddress);
    }

    public void removeHasAddress(String oldHasAddress) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASADDRESS, oldHasAddress);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasCity
     */
     
    public Collection<? extends String> getHasCity() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCITY, String.class);
    }

    public boolean hasHasCity() {
		return !getHasCity().isEmpty();
    }

    public void addHasCity(String newHasCity) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCITY, newHasCity);
    }

    public void removeHasCity(String oldHasCity) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCITY, oldHasCity);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasInstitutionHomePage
     */
     
    public Collection<? extends Object> getHasInstitutionHomePage() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONHOMEPAGE, Object.class);
    }

    public boolean hasHasInstitutionHomePage() {
		return !getHasInstitutionHomePage().isEmpty();
    }

    public void addHasInstitutionHomePage(Object newHasInstitutionHomePage) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONHOMEPAGE, newHasInstitutionHomePage);
    }

    public void removeHasInstitutionHomePage(Object oldHasInstitutionHomePage) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONHOMEPAGE, oldHasInstitutionHomePage);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasInstitutionName
     */
     
    public Collection<? extends String> getHasInstitutionName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONNAME, String.class);
    }

    public boolean hasHasInstitutionName() {
		return !getHasInstitutionName().isEmpty();
    }

    public void addHasInstitutionName(String newHasInstitutionName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONNAME, newHasInstitutionName);
    }

    public void removeHasInstitutionName(String oldHasInstitutionName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINSTITUTIONNAME, oldHasInstitutionName);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasLatitude
     */
     
    public Collection<? extends Object> getHasLatitude() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLATITUDE, Object.class);
    }

    public boolean hasHasLatitude() {
		return !getHasLatitude().isEmpty();
    }

    public void addHasLatitude(Object newHasLatitude) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLATITUDE, newHasLatitude);
    }

    public void removeHasLatitude(Object oldHasLatitude) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLATITUDE, oldHasLatitude);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasLongitude
     */
     
    public Collection<? extends Object> getHasLongitude() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLONGITUDE, Object.class);
    }

    public boolean hasHasLongitude() {
		return !getHasLongitude().isEmpty();
    }

    public void addHasLongitude(Object newHasLongitude) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLONGITUDE, newHasLongitude);
    }

    public void removeHasLongitude(Object oldHasLongitude) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASLONGITUDE, oldHasLongitude);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasState
     */
     
    public Collection<? extends String> getHasState() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASSTATE, String.class);
    }

    public boolean hasHasState() {
		return !getHasState().isEmpty();
    }

    public void addHasState(String newHasState) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASSTATE, newHasState);
    }

    public void removeHasState(String oldHasState) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASSTATE, oldHasState);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasZipCode
     */
     
    public Collection<? extends String> getHasZipCode() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZIPCODE, String.class);
    }

    public boolean hasHasZipCode() {
		return !getHasZipCode().isEmpty();
    }

    public void addHasZipCode(String newHasZipCode) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZIPCODE, newHasZipCode);
    }

    public void removeHasZipCode(String oldHasZipCode) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZIPCODE, oldHasZipCode);
    }


}
