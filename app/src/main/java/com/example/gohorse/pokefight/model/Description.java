package com.example.gohorse.pokefight.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bruno on 28/05/2015.
 */

public class Description {

    private String name;
    private String resource_uri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Description withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The resourceUri
     */
    public String getResourceUri() {
        return resource_uri;
    }

    /**
     *
     * @param resourceUri
     * The resource_uri
     */
    public void setResourceUri(String resourceUri) {
        this.resource_uri = resourceUri;
    }

    public Description withResourceUri(String resourceUri) {
        this.resource_uri = resourceUri;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Description withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
