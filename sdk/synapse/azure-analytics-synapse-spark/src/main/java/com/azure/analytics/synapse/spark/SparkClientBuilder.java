// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark;

import com.azure.analytics.synapse.spark.implementation.SparkClientImpl;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the SparkClient type. */
@ServiceClientBuilder(
        serviceClients = {
            SparkBatchClient.class,
            SparkSessionClient.class,
            SparkBatchAsyncClient.class,
            SparkSessionAsyncClient.class
        })
public final class SparkClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://dev.azuresynapse.net/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the SparkClientBuilder. */
    public SparkClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The workspace development endpoint, for example
     * https://myworkspace.dev.azuresynapse.net.
     */
    private String endpoint;

    /**
     * Sets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     *
     * @param endpoint the endpoint value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Valid api-version for the request.
     */
    private String livyApiVersion;

    /**
     * Sets Valid api-version for the request.
     *
     * @param livyApiVersion the livyApiVersion value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder livyApiVersion(String livyApiVersion) {
        this.livyApiVersion = livyApiVersion;
        return this;
    }

    /*
     * Name of the spark pool.
     */
    private String sparkPoolName;

    /**
     * Sets Name of the spark pool.
     *
     * @param sparkPoolName the sparkPoolName value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder sparkPoolName(String sparkPoolName) {
        this.sparkPoolName = sparkPoolName;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the SparkClientBuilder.
     */
    public SparkClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of SparkClientImpl with the provided parameters.
     *
     * @return an instance of SparkClientImpl.
     */
    private SparkClientImpl buildInnerClient() {
        if (livyApiVersion == null) {
            this.livyApiVersion = "2019-11-01-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        SparkClientImpl client =
                new SparkClientImpl(pipeline, serializerAdapter, endpoint, livyApiVersion, sparkPoolName);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of SparkBatchAsyncClient async client.
     *
     * @return an instance of SparkBatchAsyncClient.
     */
    public SparkBatchAsyncClient buildSparkBatchAsyncClient() {
        return new SparkBatchAsyncClient(buildInnerClient().getSparkBatches());
    }

    /**
     * Builds an instance of SparkSessionAsyncClient async client.
     *
     * @return an instance of SparkSessionAsyncClient.
     */
    public SparkSessionAsyncClient buildSparkSessionAsyncClient() {
        return new SparkSessionAsyncClient(buildInnerClient().getSparkSessions());
    }

    /**
     * Builds an instance of SparkBatchClient sync client.
     *
     * @return an instance of SparkBatchClient.
     */
    public SparkBatchClient buildSparkBatchClient() {
        return new SparkBatchClient(buildInnerClient().getSparkBatches());
    }

    /**
     * Builds an instance of SparkSessionClient sync client.
     *
     * @return an instance of SparkSessionClient.
     */
    public SparkSessionClient buildSparkSessionClient() {
        return new SparkSessionClient(buildInnerClient().getSparkSessions());
    }
}