/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Pricebook2
 */
@XStreamAlias("Pricebook2")
public class Pricebook2 extends AbstractSObjectBase {

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // IsStandard
    private Boolean IsStandard;

    @JsonProperty("IsStandard")
    public Boolean getIsStandard() {
        return this.IsStandard;
    }

    @JsonProperty("IsStandard")
    public void setIsStandard(Boolean IsStandard) {
        this.IsStandard = IsStandard;
    }

}