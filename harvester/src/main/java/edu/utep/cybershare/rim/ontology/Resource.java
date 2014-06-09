package edu.utep.cybershare.rim.ontology;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Resource <br>
 * @version generated on Mon Jun 09 10:57:54 GMT-07:00 2014 by nick
 */

public interface Resource extends WrappedIndividual {

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
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
