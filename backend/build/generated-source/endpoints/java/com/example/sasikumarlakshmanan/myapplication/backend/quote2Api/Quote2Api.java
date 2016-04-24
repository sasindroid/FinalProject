/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-24 at 19:37:42 UTC 
 * Modify at your own risk.
 */

package com.example.sasikumarlakshmanan.myapplication.backend.quote2Api;

/**
 * Service definition for Quote2Api (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link Quote2ApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Quote2Api extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the quote2Api library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://udacitybuiltitbigger-1289.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "quote2Api/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Quote2Api(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Quote2Api(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getQuote2".
   *
   * This request holds the parameters needed by the quote2Api server.  After setting any optional
   * parameters, call the {@link GetQuote2#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetQuote2 getQuote2(java.lang.Long id) throws java.io.IOException {
    GetQuote2 result = new GetQuote2(id);
    initialize(result);
    return result;
  }

  public class GetQuote2 extends Quote2ApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2> {

    private static final String REST_PATH = "quote2/{id}";

    /**
     * Create a request for the method "getQuote2".
     *
     * This request holds the parameters needed by the the quote2Api server.  After setting any
     * optional parameters, call the {@link GetQuote2#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetQuote2#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetQuote2(java.lang.Long id) {
      super(Quote2Api.this, "GET", REST_PATH, null, com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetQuote2 setAlt(java.lang.String alt) {
      return (GetQuote2) super.setAlt(alt);
    }

    @Override
    public GetQuote2 setFields(java.lang.String fields) {
      return (GetQuote2) super.setFields(fields);
    }

    @Override
    public GetQuote2 setKey(java.lang.String key) {
      return (GetQuote2) super.setKey(key);
    }

    @Override
    public GetQuote2 setOauthToken(java.lang.String oauthToken) {
      return (GetQuote2) super.setOauthToken(oauthToken);
    }

    @Override
    public GetQuote2 setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetQuote2) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetQuote2 setQuotaUser(java.lang.String quotaUser) {
      return (GetQuote2) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetQuote2 setUserIp(java.lang.String userIp) {
      return (GetQuote2) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetQuote2 setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetQuote2 set(String parameterName, Object value) {
      return (GetQuote2) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getQuotesList".
   *
   * This request holds the parameters needed by the quote2Api server.  After setting any optional
   * parameters, call the {@link GetQuotesList#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetQuotesList getQuotesList() throws java.io.IOException {
    GetQuotesList result = new GetQuotesList();
    initialize(result);
    return result;
  }

  public class GetQuotesList extends Quote2ApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2Collection> {

    private static final String REST_PATH = "quote2";

    /**
     * Create a request for the method "getQuotesList".
     *
     * This request holds the parameters needed by the the quote2Api server.  After setting any
     * optional parameters, call the {@link GetQuotesList#execute()} method to invoke the remote
     * operation. <p> {@link GetQuotesList#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected GetQuotesList() {
      super(Quote2Api.this, "GET", REST_PATH, null, com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2Collection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetQuotesList setAlt(java.lang.String alt) {
      return (GetQuotesList) super.setAlt(alt);
    }

    @Override
    public GetQuotesList setFields(java.lang.String fields) {
      return (GetQuotesList) super.setFields(fields);
    }

    @Override
    public GetQuotesList setKey(java.lang.String key) {
      return (GetQuotesList) super.setKey(key);
    }

    @Override
    public GetQuotesList setOauthToken(java.lang.String oauthToken) {
      return (GetQuotesList) super.setOauthToken(oauthToken);
    }

    @Override
    public GetQuotesList setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetQuotesList) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetQuotesList setQuotaUser(java.lang.String quotaUser) {
      return (GetQuotesList) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetQuotesList setUserIp(java.lang.String userIp) {
      return (GetQuotesList) super.setUserIp(userIp);
    }

    @Override
    public GetQuotesList set(String parameterName, Object value) {
      return (GetQuotesList) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertQuote2".
   *
   * This request holds the parameters needed by the quote2Api server.  After setting any optional
   * parameters, call the {@link InsertQuote2#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2}
   * @return the request
   */
  public InsertQuote2 insertQuote2(com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2 content) throws java.io.IOException {
    InsertQuote2 result = new InsertQuote2(content);
    initialize(result);
    return result;
  }

  public class InsertQuote2 extends Quote2ApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2> {

    private static final String REST_PATH = "quote2";

    /**
     * Create a request for the method "insertQuote2".
     *
     * This request holds the parameters needed by the the quote2Api server.  After setting any
     * optional parameters, call the {@link InsertQuote2#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertQuote2#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2}
     * @since 1.13
     */
    protected InsertQuote2(com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2 content) {
      super(Quote2Api.this, "POST", REST_PATH, content, com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2.class);
    }

    @Override
    public InsertQuote2 setAlt(java.lang.String alt) {
      return (InsertQuote2) super.setAlt(alt);
    }

    @Override
    public InsertQuote2 setFields(java.lang.String fields) {
      return (InsertQuote2) super.setFields(fields);
    }

    @Override
    public InsertQuote2 setKey(java.lang.String key) {
      return (InsertQuote2) super.setKey(key);
    }

    @Override
    public InsertQuote2 setOauthToken(java.lang.String oauthToken) {
      return (InsertQuote2) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertQuote2 setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertQuote2) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertQuote2 setQuotaUser(java.lang.String quotaUser) {
      return (InsertQuote2) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertQuote2 setUserIp(java.lang.String userIp) {
      return (InsertQuote2) super.setUserIp(userIp);
    }

    @Override
    public InsertQuote2 set(String parameterName, Object value) {
      return (InsertQuote2) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Quote2Api}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Quote2Api}. */
    @Override
    public Quote2Api build() {
      return new Quote2Api(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link Quote2ApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setQuote2ApiRequestInitializer(
        Quote2ApiRequestInitializer quote2apiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(quote2apiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
