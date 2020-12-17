// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Cassandra database dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CassandraTable")
@JsonFlatten
@Fluent
public class CassandraTableDataset extends Dataset {
    /*
     * The table name of the Cassandra database. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /*
     * The keyspace of the Cassandra database. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.keyspace")
    private Object keyspace;

    /**
     * Get the tableName property: The table name of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @param tableName the tableName value to set.
     * @return the CassandraTableDataset object itself.
     */
    public CassandraTableDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the keyspace property: The keyspace of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @return the keyspace value.
     */
    public Object getKeyspace() {
        return this.keyspace;
    }

    /**
     * Set the keyspace property: The keyspace of the Cassandra database. Type: string (or Expression with resultType
     * string).
     *
     * @param keyspace the keyspace value to set.
     * @return the CassandraTableDataset object itself.
     */
    public CassandraTableDataset setKeyspace(Object keyspace) {
        this.keyspace = keyspace;
        return this;
    }
}