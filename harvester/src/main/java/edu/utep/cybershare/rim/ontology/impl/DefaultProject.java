package edu.utep.cybershare.rim.ontology.impl;

import edu.utep.cybershare.rim.ontology.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultProject <br>
 * @version generated on Fri Jun 13 12:09:56 GMT-07:00 2014 by nick
 */
public class DefaultProject extends WrappedIndividualImpl implements Project {

    public DefaultProject(OWLOntology ontology, IRI iri) {
        super(ontology, iri);
    }





    /* ***************************************************
     * Object Property http://ontology.cybershare.utep.edu/RIM/rim.owl#fundedByAgency
     */
     
    public Collection<? extends Agency> getFundedByAgency() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_FUNDEDBYAGENCY,
                                               DefaultAgency.class);
    }

    public boolean hasFundedByAgency() {
	   return !getFundedByAgency().isEmpty();
    }

    public void addFundedByAgency(Agency newFundedByAgency) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_FUNDEDBYAGENCY,
                                       newFundedByAgency);
    }

    public void removeFundedByAgency(Agency oldFundedByAgency) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_FUNDEDBYAGENCY,
                                          oldFundedByAgency);
    }


    /* ***************************************************
     * Object Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hostedByInstitution
     */
     
    public Collection<? extends Institution> getHostedByInstitution() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HOSTEDBYINSTITUTION,
                                               DefaultInstitution.class);
    }

    public boolean hasHostedByInstitution() {
	   return !getHostedByInstitution().isEmpty();
    }

    public void addHostedByInstitution(Institution newHostedByInstitution) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HOSTEDBYINSTITUTION,
                                       newHostedByInstitution);
    }

    public void removeHostedByInstitution(Institution oldHostedByInstitution) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HOSTEDBYINSTITUTION,
                                          oldHostedByInstitution);
    }


    /* ***************************************************
     * Object Property http://ontology.cybershare.utep.edu/RIM/rim.owl#investigatedByCoPI
     */
     
    public Collection<? extends Person> getInvestigatedByCoPI() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYCOPI,
                                               DefaultPerson.class);
    }

    public boolean hasInvestigatedByCoPI() {
	   return !getInvestigatedByCoPI().isEmpty();
    }

    public void addInvestigatedByCoPI(Person newInvestigatedByCoPI) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYCOPI,
                                       newInvestigatedByCoPI);
    }

    public void removeInvestigatedByCoPI(Person oldInvestigatedByCoPI) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYCOPI,
                                          oldInvestigatedByCoPI);
    }


    /* ***************************************************
     * Object Property http://ontology.cybershare.utep.edu/RIM/rim.owl#investigatedByPI
     */
     
    public Collection<? extends Person> getInvestigatedByPI() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYPI,
                                               DefaultPerson.class);
    }

    public boolean hasInvestigatedByPI() {
	   return !getInvestigatedByPI().isEmpty();
    }

    public void addInvestigatedByPI(Person newInvestigatedByPI) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYPI,
                                       newInvestigatedByPI);
    }

    public void removeInvestigatedByPI(Person oldInvestigatedByPI) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INVESTIGATEDBYPI,
                                          oldInvestigatedByPI);
    }


    /* ***************************************************
     * Object Property http://ontology.cybershare.utep.edu/RIM/rim.owl#relatedToProject
     */
     
    public Collection<? extends Project> getRelatedToProject() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RELATEDTOPROJECT,
                                               DefaultProject.class);
    }

    public boolean hasRelatedToProject() {
	   return !getRelatedToProject().isEmpty();
    }

    public void addRelatedToProject(Project newRelatedToProject) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RELATEDTOPROJECT,
                                       newRelatedToProject);
    }

    public void removeRelatedToProject(Project oldRelatedToProject) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RELATEDTOPROJECT,
                                          oldRelatedToProject);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#associatedWithAgencyProgram
     */
     
    public Collection<? extends String> getAssociatedWithAgencyProgram() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ASSOCIATEDWITHAGENCYPROGRAM, String.class);
    }

    public boolean hasAssociatedWithAgencyProgram() {
		return !getAssociatedWithAgencyProgram().isEmpty();
    }

    public void addAssociatedWithAgencyProgram(String newAssociatedWithAgencyProgram) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ASSOCIATEDWITHAGENCYPROGRAM, newAssociatedWithAgencyProgram);
    }

    public void removeAssociatedWithAgencyProgram(String oldAssociatedWithAgencyProgram) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ASSOCIATEDWITHAGENCYPROGRAM, oldAssociatedWithAgencyProgram);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#describedByAbstract
     */
     
    public Collection<? extends String> getDescribedByAbstract() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIBEDBYABSTRACT, String.class);
    }

    public boolean hasDescribedByAbstract() {
		return !getDescribedByAbstract().isEmpty();
    }

    public void addDescribedByAbstract(String newDescribedByAbstract) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIBEDBYABSTRACT, newDescribedByAbstract);
    }

    public void removeDescribedByAbstract(String oldDescribedByAbstract) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIBEDBYABSTRACT, oldDescribedByAbstract);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#endedAtDate
     */
     
    public Collection<? extends Object> getEndedAtDate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENDEDATDATE, Object.class);
    }

    public boolean hasEndedAtDate() {
		return !getEndedAtDate().isEmpty();
    }

    public void addEndedAtDate(Object newEndedAtDate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENDEDATDATE, newEndedAtDate);
    }

    public void removeEndedAtDate(Object oldEndedAtDate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ENDEDATDATE, oldEndedAtDate);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasAwardHomePage
     */
     
    public Collection<? extends Object> getHasAwardHomePage() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASAWARDHOMEPAGE, Object.class);
    }

    public boolean hasHasAwardHomePage() {
		return !getHasAwardHomePage().isEmpty();
    }

    public void addHasAwardHomePage(Object newHasAwardHomePage) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASAWARDHOMEPAGE, newHasAwardHomePage);
    }

    public void removeHasAwardHomePage(Object oldHasAwardHomePage) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASAWARDHOMEPAGE, oldHasAwardHomePage);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasDocumentation
     */
     
    public Collection<? extends String> getHasDocumentation() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDOCUMENTATION, String.class);
    }

    public boolean hasHasDocumentation() {
		return !getHasDocumentation().isEmpty();
    }

    public void addHasDocumentation(String newHasDocumentation) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDOCUMENTATION, newHasDocumentation);
    }

    public void removeHasDocumentation(String oldHasDocumentation) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDOCUMENTATION, oldHasDocumentation);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasProjectHomePage
     */
     
    public Collection<? extends Object> getHasProjectHomePage() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPROJECTHOMEPAGE, Object.class);
    }

    public boolean hasHasProjectHomePage() {
		return !getHasProjectHomePage().isEmpty();
    }

    public void addHasProjectHomePage(Object newHasProjectHomePage) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPROJECTHOMEPAGE, newHasProjectHomePage);
    }

    public void removeHasProjectHomePage(Object oldHasProjectHomePage) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPROJECTHOMEPAGE, oldHasProjectHomePage);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByCollectionID
     */
     
    public Collection<? extends String> getIdentifiedByCollectionID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYCOLLECTIONID, String.class);
    }

    public boolean hasIdentifiedByCollectionID() {
		return !getIdentifiedByCollectionID().isEmpty();
    }

    public void addIdentifiedByCollectionID(String newIdentifiedByCollectionID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYCOLLECTIONID, newIdentifiedByCollectionID);
    }

    public void removeIdentifiedByCollectionID(String oldIdentifiedByCollectionID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYCOLLECTIONID, oldIdentifiedByCollectionID);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByGrantID
     */
     
    public Collection<? extends String> getIdentifiedByGrantID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYGRANTID, String.class);
    }

    public boolean hasIdentifiedByGrantID() {
		return !getIdentifiedByGrantID().isEmpty();
    }

    public void addIdentifiedByGrantID(String newIdentifiedByGrantID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYGRANTID, newIdentifiedByGrantID);
    }

    public void removeIdentifiedByGrantID(String oldIdentifiedByGrantID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYGRANTID, oldIdentifiedByGrantID);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByTitle
     */
     
    public Collection<? extends String> getIdentifiedByTitle() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYTITLE, String.class);
    }

    public boolean hasIdentifiedByTitle() {
		return !getIdentifiedByTitle().isEmpty();
    }

    public void addIdentifiedByTitle(String newIdentifiedByTitle) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYTITLE, newIdentifiedByTitle);
    }

    public void removeIdentifiedByTitle(String oldIdentifiedByTitle) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDENTIFIEDBYTITLE, oldIdentifiedByTitle);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#startedAtDate
     */
     
    public Collection<? extends Object> getStartedAtDate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STARTEDATDATE, Object.class);
    }

    public boolean hasStartedAtDate() {
		return !getStartedAtDate().isEmpty();
    }

    public void addStartedAtDate(Object newStartedAtDate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STARTEDATDATE, newStartedAtDate);
    }

    public void removeStartedAtDate(Object oldStartedAtDate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STARTEDATDATE, oldStartedAtDate);
    }


    /* ***************************************************
     * Data Property http://ontology.cybershare.utep.edu/RIM/rim.owl#wasAwardedAmount
     */
     
    public Collection<? extends Object> getWasAwardedAmount() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WASAWARDEDAMOUNT, Object.class);
    }

    public boolean hasWasAwardedAmount() {
		return !getWasAwardedAmount().isEmpty();
    }

    public void addWasAwardedAmount(Object newWasAwardedAmount) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WASAWARDEDAMOUNT, newWasAwardedAmount);
    }

    public void removeWasAwardedAmount(Object oldWasAwardedAmount) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WASAWARDEDAMOUNT, oldWasAwardedAmount);
    }


}
