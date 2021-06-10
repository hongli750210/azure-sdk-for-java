// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of cognitive services accounts operation response. */
@Fluent
public final class AccountListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountListResult.class);

    /*
     * The link used to get the next page of accounts.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Gets the list of Cognitive Services accounts and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<AccountInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of accounts.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of accounts.
     *
     * @param nextLink the nextLink value to set.
     * @return the AccountListResult object itself.
     */
    public AccountListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Gets the list of Cognitive Services accounts and their properties.
     *
     * @return the value value.
     */
    public List<AccountInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
