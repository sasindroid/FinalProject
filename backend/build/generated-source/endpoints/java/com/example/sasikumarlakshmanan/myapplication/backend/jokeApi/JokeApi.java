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
 * on 2016-04-24 at 22:57:36 UTC 
 * Modify at your own risk.
 */

package com.example.sasikumarlakshmanan.myapplication.backend.jokeApi;

/**
 * Service definition for JokeApi (v1).
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
 * This service uses {@link JokeApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class JokeApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the jokeApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "jokeApi/v1/";

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
  public JokeApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  JokeApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "deleteAllJokes".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link DeleteAllJokes#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public DeleteAllJokes deleteAllJokes() throws java.io.IOException {
    DeleteAllJokes result = new DeleteAllJokes();
    initialize(result);
    return result;
  }

  public class DeleteAllJokes extends JokeApiRequest<Void> {

    private static final String REST_PATH = "joke";

    /**
     * Create a request for the method "deleteAllJokes".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link DeleteAllJokes#execute()} method to invoke the remote operation.
     * <p> {@link DeleteAllJokes#initialize(com.google.api.client.googleapis.services.AbstractGoogleCl
     * ientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @since 1.13
     */
    protected DeleteAllJokes() {
      super(JokeApi.this, "DELETE", REST_PATH, null, Void.class);
    }

    @Override
    public DeleteAllJokes setAlt(java.lang.String alt) {
      return (DeleteAllJokes) super.setAlt(alt);
    }

    @Override
    public DeleteAllJokes setFields(java.lang.String fields) {
      return (DeleteAllJokes) super.setFields(fields);
    }

    @Override
    public DeleteAllJokes setKey(java.lang.String key) {
      return (DeleteAllJokes) super.setKey(key);
    }

    @Override
    public DeleteAllJokes setOauthToken(java.lang.String oauthToken) {
      return (DeleteAllJokes) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteAllJokes setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteAllJokes) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteAllJokes setQuotaUser(java.lang.String quotaUser) {
      return (DeleteAllJokes) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteAllJokes setUserIp(java.lang.String userIp) {
      return (DeleteAllJokes) super.setUserIp(userIp);
    }

    @Override
    public DeleteAllJokes set(String parameterName, Object value) {
      return (DeleteAllJokes) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getJoke".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link GetJoke#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetJoke getJoke(java.lang.Long id) throws java.io.IOException {
    GetJoke result = new GetJoke(id);
    initialize(result);
    return result;
  }

  public class GetJoke extends JokeApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke> {

    private static final String REST_PATH = "joke/{id}";

    /**
     * Create a request for the method "getJoke".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link GetJoke#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetJoke#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetJoke(java.lang.Long id) {
      super(JokeApi.this, "GET", REST_PATH, null, com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke.class);
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
    public GetJoke setAlt(java.lang.String alt) {
      return (GetJoke) super.setAlt(alt);
    }

    @Override
    public GetJoke setFields(java.lang.String fields) {
      return (GetJoke) super.setFields(fields);
    }

    @Override
    public GetJoke setKey(java.lang.String key) {
      return (GetJoke) super.setKey(key);
    }

    @Override
    public GetJoke setOauthToken(java.lang.String oauthToken) {
      return (GetJoke) super.setOauthToken(oauthToken);
    }

    @Override
    public GetJoke setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetJoke) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetJoke setQuotaUser(java.lang.String quotaUser) {
      return (GetJoke) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetJoke setUserIp(java.lang.String userIp) {
      return (GetJoke) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetJoke setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetJoke set(String parameterName, Object value) {
      return (GetJoke) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getJokesList".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link GetJokesList#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetJokesList getJokesList() throws java.io.IOException {
    GetJokesList result = new GetJokesList();
    initialize(result);
    return result;
  }

  public class GetJokesList extends JokeApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.JokeCollection> {

    private static final String REST_PATH = "joke";

    /**
     * Create a request for the method "getJokesList".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link GetJokesList#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetJokesList#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetJokesList() {
      super(JokeApi.this, "GET", REST_PATH, null, com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.JokeCollection.class);
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
    public GetJokesList setAlt(java.lang.String alt) {
      return (GetJokesList) super.setAlt(alt);
    }

    @Override
    public GetJokesList setFields(java.lang.String fields) {
      return (GetJokesList) super.setFields(fields);
    }

    @Override
    public GetJokesList setKey(java.lang.String key) {
      return (GetJokesList) super.setKey(key);
    }

    @Override
    public GetJokesList setOauthToken(java.lang.String oauthToken) {
      return (GetJokesList) super.setOauthToken(oauthToken);
    }

    @Override
    public GetJokesList setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetJokesList) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetJokesList setQuotaUser(java.lang.String quotaUser) {
      return (GetJokesList) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetJokesList setUserIp(java.lang.String userIp) {
      return (GetJokesList) super.setUserIp(userIp);
    }

    @Override
    public GetJokesList set(String parameterName, Object value) {
      return (GetJokesList) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertJoke".
   *
   * This request holds the parameters needed by the jokeApi server.  After setting any optional
   * parameters, call the {@link InsertJoke#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke}
   * @return the request
   */
  public InsertJoke insertJoke(com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke content) throws java.io.IOException {
    InsertJoke result = new InsertJoke(content);
    initialize(result);
    return result;
  }

  public class InsertJoke extends JokeApiRequest<com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke> {

    private static final String REST_PATH = "joke";

    /**
     * Create a request for the method "insertJoke".
     *
     * This request holds the parameters needed by the the jokeApi server.  After setting any optional
     * parameters, call the {@link InsertJoke#execute()} method to invoke the remote operation. <p>
     * {@link
     * InsertJoke#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke}
     * @since 1.13
     */
    protected InsertJoke(com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke content) {
      super(JokeApi.this, "POST", REST_PATH, content, com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke.class);
    }

    @Override
    public InsertJoke setAlt(java.lang.String alt) {
      return (InsertJoke) super.setAlt(alt);
    }

    @Override
    public InsertJoke setFields(java.lang.String fields) {
      return (InsertJoke) super.setFields(fields);
    }

    @Override
    public InsertJoke setKey(java.lang.String key) {
      return (InsertJoke) super.setKey(key);
    }

    @Override
    public InsertJoke setOauthToken(java.lang.String oauthToken) {
      return (InsertJoke) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertJoke setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertJoke) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertJoke setQuotaUser(java.lang.String quotaUser) {
      return (InsertJoke) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertJoke setUserIp(java.lang.String userIp) {
      return (InsertJoke) super.setUserIp(userIp);
    }

    @Override
    public InsertJoke set(String parameterName, Object value) {
      return (InsertJoke) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link JokeApi}.
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

    /** Builds a new instance of {@link JokeApi}. */
    @Override
    public JokeApi build() {
      return new JokeApi(this);
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
     * Set the {@link JokeApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setJokeApiRequestInitializer(
        JokeApiRequestInitializer jokeapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(jokeapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
