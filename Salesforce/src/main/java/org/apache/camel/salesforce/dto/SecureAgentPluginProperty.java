/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject SecureAgentPluginProperty
 */
@XStreamAlias("SecureAgentPluginProperty")
public class SecureAgentPluginProperty extends AbstractSObjectBase {

    // SecureAgentPluginId
    private String SecureAgentPluginId;

    @JsonProperty("SecureAgentPluginId")
    public String getSecureAgentPluginId() {
        return this.SecureAgentPluginId;
    }

    @JsonProperty("SecureAgentPluginId")
    public void setSecureAgentPluginId(String SecureAgentPluginId) {
        this.SecureAgentPluginId = SecureAgentPluginId;
    }

    // PropertyName
    private String PropertyName;

    @JsonProperty("PropertyName")
    public String getPropertyName() {
        return this.PropertyName;
    }

    @JsonProperty("PropertyName")
    public void setPropertyName(String PropertyName) {
        this.PropertyName = PropertyName;
    }

    // PropertyValue
    private String PropertyValue;

    @JsonProperty("PropertyValue")
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    @JsonProperty("PropertyValue")
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

}
