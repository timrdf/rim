package edu.utep.cybershare.rim.ontology;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Project <br>
 * @version generated on Mon Jun 09 10:57:54 GMT-07:00 2014 by nick
 */

public interface Project extends Resource {

    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#fundedByAgency
     */
     
    /**
     * Gets all property values for the fundedByAgency property.<p>
     * 
     * @returns a collection of values for the fundedByAgency property.
     */
    Collection<? extends Agency> getFundedByAgency();

    /**
     * Checks if the class has a fundedByAgency property value.<p>
     * 
     * @return true if there is a fundedByAgency property value.
     */
    boolean hasFundedByAgency();

    /**
     * Adds a fundedByAgency property value.<p>
     * 
     * @param newFundedByAgency the fundedByAgency property value to be added
     */
    void addFundedByAgency(Agency newFundedByAgency);

    /**
     * Removes a fundedByAgency property value.<p>
     * 
     * @param oldFundedByAgency the fundedByAgency property value to be removed.
     */
    void removeFundedByAgency(Agency oldFundedByAgency);


    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hostedByInstitution
     */
     
    /**
     * Gets all property values for the hostedByInstitution property.<p>
     * 
     * @returns a collection of values for the hostedByInstitution property.
     */
    Collection<? extends Institution> getHostedByInstitution();

    /**
     * Checks if the class has a hostedByInstitution property value.<p>
     * 
     * @return true if there is a hostedByInstitution property value.
     */
    boolean hasHostedByInstitution();

    /**
     * Adds a hostedByInstitution property value.<p>
     * 
     * @param newHostedByInstitution the hostedByInstitution property value to be added
     */
    void addHostedByInstitution(Institution newHostedByInstitution);

    /**
     * Removes a hostedByInstitution property value.<p>
     * 
     * @param oldHostedByInstitution the hostedByInstitution property value to be removed.
     */
    void removeHostedByInstitution(Institution oldHostedByInstitution);


    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#investigatedByCoPI
     */
     
    /**
     * Gets all property values for the investigatedByCoPI property.<p>
     * 
     * @returns a collection of values for the investigatedByCoPI property.
     */
    Collection<? extends Person> getInvestigatedByCoPI();

    /**
     * Checks if the class has a investigatedByCoPI property value.<p>
     * 
     * @return true if there is a investigatedByCoPI property value.
     */
    boolean hasInvestigatedByCoPI();

    /**
     * Adds a investigatedByCoPI property value.<p>
     * 
     * @param newInvestigatedByCoPI the investigatedByCoPI property value to be added
     */
    void addInvestigatedByCoPI(Person newInvestigatedByCoPI);

    /**
     * Removes a investigatedByCoPI property value.<p>
     * 
     * @param oldInvestigatedByCoPI the investigatedByCoPI property value to be removed.
     */
    void removeInvestigatedByCoPI(Person oldInvestigatedByCoPI);


    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#investigatedByPI
     */
     
    /**
     * Gets all property values for the investigatedByPI property.<p>
     * 
     * @returns a collection of values for the investigatedByPI property.
     */
    Collection<? extends Person> getInvestigatedByPI();

    /**
     * Checks if the class has a investigatedByPI property value.<p>
     * 
     * @return true if there is a investigatedByPI property value.
     */
    boolean hasInvestigatedByPI();

    /**
     * Adds a investigatedByPI property value.<p>
     * 
     * @param newInvestigatedByPI the investigatedByPI property value to be added
     */
    void addInvestigatedByPI(Person newInvestigatedByPI);

    /**
     * Removes a investigatedByPI property value.<p>
     * 
     * @param oldInvestigatedByPI the investigatedByPI property value to be removed.
     */
    void removeInvestigatedByPI(Person oldInvestigatedByPI);


    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#relatedToResource
     */
     
    /**
     * Gets all property values for the relatedToResource property.<p>
     * 
     * @returns a collection of values for the relatedToResource property.
     */
    Collection<? extends Resource> getRelatedToResource();

    /**
     * Checks if the class has a relatedToResource property value.<p>
     * 
     * @return true if there is a relatedToResource property value.
     */
    boolean hasRelatedToResource();

    /**
     * Adds a relatedToResource property value.<p>
     * 
     * @param newRelatedToResource the relatedToResource property value to be added
     */
    void addRelatedToResource(Resource newRelatedToResource);

    /**
     * Removes a relatedToResource property value.<p>
     * 
     * @param oldRelatedToResource the relatedToResource property value to be removed.
     */
    void removeRelatedToResource(Resource oldRelatedToResource);


    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#describedByAbstract
     */
     
    /**
     * Gets all property values for the describedByAbstract property.<p>
     * 
     * @returns a collection of values for the describedByAbstract property.
     */
    Collection<? extends String> getDescribedByAbstract();

    /**
     * Checks if the class has a describedByAbstract property value.<p>
     * 
     * @return true if there is a describedByAbstract property value.
     */
    boolean hasDescribedByAbstract();

    /**
     * Adds a describedByAbstract property value.<p>
     * 
     * @param newDescribedByAbstract the describedByAbstract property value to be added
     */
    void addDescribedByAbstract(String newDescribedByAbstract);

    /**
     * Removes a describedByAbstract property value.<p>
     * 
     * @param oldDescribedByAbstract the describedByAbstract property value to be removed.
     */
    void removeDescribedByAbstract(String oldDescribedByAbstract);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#endedAtDate
     */
     
    /**
     * Gets all property values for the endedAtDate property.<p>
     * 
     * @returns a collection of values for the endedAtDate property.
     */
    Collection<? extends Object> getEndedAtDate();

    /**
     * Checks if the class has a endedAtDate property value.<p>
     * 
     * @return true if there is a endedAtDate property value.
     */
    boolean hasEndedAtDate();

    /**
     * Adds a endedAtDate property value.<p>
     * 
     * @param newEndedAtDate the endedAtDate property value to be added
     */
    void addEndedAtDate(Object newEndedAtDate);

    /**
     * Removes a endedAtDate property value.<p>
     * 
     * @param oldEndedAtDate the endedAtDate property value to be removed.
     */
    void removeEndedAtDate(Object oldEndedAtDate);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasDocumentation
     */
     
    /**
     * Gets all property values for the hasDocumentation property.<p>
     * 
     * @returns a collection of values for the hasDocumentation property.
     */
    Collection<? extends String> getHasDocumentation();

    /**
     * Checks if the class has a hasDocumentation property value.<p>
     * 
     * @return true if there is a hasDocumentation property value.
     */
    boolean hasHasDocumentation();

    /**
     * Adds a hasDocumentation property value.<p>
     * 
     * @param newHasDocumentation the hasDocumentation property value to be added
     */
    void addHasDocumentation(String newHasDocumentation);

    /**
     * Removes a hasDocumentation property value.<p>
     * 
     * @param oldHasDocumentation the hasDocumentation property value to be removed.
     */
    void removeHasDocumentation(String oldHasDocumentation);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#hasProjectHomePage
     */
     
    /**
     * Gets all property values for the hasProjectHomePage property.<p>
     * 
     * @returns a collection of values for the hasProjectHomePage property.
     */
    Collection<? extends Object> getHasProjectHomePage();

    /**
     * Checks if the class has a hasProjectHomePage property value.<p>
     * 
     * @return true if there is a hasProjectHomePage property value.
     */
    boolean hasHasProjectHomePage();

    /**
     * Adds a hasProjectHomePage property value.<p>
     * 
     * @param newHasProjectHomePage the hasProjectHomePage property value to be added
     */
    void addHasProjectHomePage(Object newHasProjectHomePage);

    /**
     * Removes a hasProjectHomePage property value.<p>
     * 
     * @param oldHasProjectHomePage the hasProjectHomePage property value to be removed.
     */
    void removeHasProjectHomePage(Object oldHasProjectHomePage);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByCollectionID
     */
     
    /**
     * Gets all property values for the identifiedByCollectionID property.<p>
     * 
     * @returns a collection of values for the identifiedByCollectionID property.
     */
    Collection<? extends String> getIdentifiedByCollectionID();

    /**
     * Checks if the class has a identifiedByCollectionID property value.<p>
     * 
     * @return true if there is a identifiedByCollectionID property value.
     */
    boolean hasIdentifiedByCollectionID();

    /**
     * Adds a identifiedByCollectionID property value.<p>
     * 
     * @param newIdentifiedByCollectionID the identifiedByCollectionID property value to be added
     */
    void addIdentifiedByCollectionID(String newIdentifiedByCollectionID);

    /**
     * Removes a identifiedByCollectionID property value.<p>
     * 
     * @param oldIdentifiedByCollectionID the identifiedByCollectionID property value to be removed.
     */
    void removeIdentifiedByCollectionID(String oldIdentifiedByCollectionID);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByGrantID
     */
     
    /**
     * Gets all property values for the identifiedByGrantID property.<p>
     * 
     * @returns a collection of values for the identifiedByGrantID property.
     */
    Collection<? extends String> getIdentifiedByGrantID();

    /**
     * Checks if the class has a identifiedByGrantID property value.<p>
     * 
     * @return true if there is a identifiedByGrantID property value.
     */
    boolean hasIdentifiedByGrantID();

    /**
     * Adds a identifiedByGrantID property value.<p>
     * 
     * @param newIdentifiedByGrantID the identifiedByGrantID property value to be added
     */
    void addIdentifiedByGrantID(String newIdentifiedByGrantID);

    /**
     * Removes a identifiedByGrantID property value.<p>
     * 
     * @param oldIdentifiedByGrantID the identifiedByGrantID property value to be removed.
     */
    void removeIdentifiedByGrantID(String oldIdentifiedByGrantID);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#identifiedByTitle
     */
     
    /**
     * Gets all property values for the identifiedByTitle property.<p>
     * 
     * @returns a collection of values for the identifiedByTitle property.
     */
    Collection<? extends String> getIdentifiedByTitle();

    /**
     * Checks if the class has a identifiedByTitle property value.<p>
     * 
     * @return true if there is a identifiedByTitle property value.
     */
    boolean hasIdentifiedByTitle();

    /**
     * Adds a identifiedByTitle property value.<p>
     * 
     * @param newIdentifiedByTitle the identifiedByTitle property value to be added
     */
    void addIdentifiedByTitle(String newIdentifiedByTitle);

    /**
     * Removes a identifiedByTitle property value.<p>
     * 
     * @param oldIdentifiedByTitle the identifiedByTitle property value to be removed.
     */
    void removeIdentifiedByTitle(String oldIdentifiedByTitle);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#startedAtDate
     */
     
    /**
     * Gets all property values for the startedAtDate property.<p>
     * 
     * @returns a collection of values for the startedAtDate property.
     */
    Collection<? extends Object> getStartedAtDate();

    /**
     * Checks if the class has a startedAtDate property value.<p>
     * 
     * @return true if there is a startedAtDate property value.
     */
    boolean hasStartedAtDate();

    /**
     * Adds a startedAtDate property value.<p>
     * 
     * @param newStartedAtDate the startedAtDate property value to be added
     */
    void addStartedAtDate(Object newStartedAtDate);

    /**
     * Removes a startedAtDate property value.<p>
     * 
     * @param oldStartedAtDate the startedAtDate property value to be removed.
     */
    void removeStartedAtDate(Object oldStartedAtDate);



    /* ***************************************************
     * Property http://ontology.cybershare.utep.edu/RIM/rim.owl#wasAwardedAmount
     */
     
    /**
     * Gets all property values for the wasAwardedAmount property.<p>
     * 
     * @returns a collection of values for the wasAwardedAmount property.
     */
    Collection<? extends Object> getWasAwardedAmount();

    /**
     * Checks if the class has a wasAwardedAmount property value.<p>
     * 
     * @return true if there is a wasAwardedAmount property value.
     */
    boolean hasWasAwardedAmount();

    /**
     * Adds a wasAwardedAmount property value.<p>
     * 
     * @param newWasAwardedAmount the wasAwardedAmount property value to be added
     */
    void addWasAwardedAmount(Object newWasAwardedAmount);

    /**
     * Removes a wasAwardedAmount property value.<p>
     * 
     * @param oldWasAwardedAmount the wasAwardedAmount property value to be removed.
     */
    void removeWasAwardedAmount(Object oldWasAwardedAmount);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
