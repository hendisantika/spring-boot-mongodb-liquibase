# spring-boot-mongodb-liquibase

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-mongodb-liquibase.git`
2. Navigate to the folder: `cd spring-boot-mongodb-liquibase`
3. Make sure your Docker is UP and Running.
4. Run the application: `mvn clean spring-boot:run`
5. Open your favorite browser: http://localhost:8080/api/customers
6. Check your console log:

```shell

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.1)

2025-01-18T06:26:02.922+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.SpringBootMongodbLiquibaseApplication : Starting SpringBootMongodbLiquibaseApplication using Java 23.0.1 with PID 22608 (/Users/hendisantika/IdeaProjects/spring-boot-mongodb-liquibase/build/classes/java/main started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-mongodb-liquibase)
2025-01-18T06:26:02.923+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.SpringBootMongodbLiquibaseApplication : No active profile set, falling back to 1 default profile: "default"
2025-01-18T06:26:02.943+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2025-01-18T06:26:02.944+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2025-01-18T06:26:02.948+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.b.d.c.l.DockerComposeLifecycleManager : Using Docker Compose file /Users/hendisantika/IdeaProjects/spring-boot-mongodb-liquibase/compose.yaml
2025-01-18T06:26:03.360+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Creating
2025-01-18T06:26:03.411+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Created
2025-01-18T06:26:03.412+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Starting
2025-01-18T06:26:03.588+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Started
2025-01-18T06:26:03.589+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Waiting
2025-01-18T06:26:04.093+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb80  Healthy
2025-01-18T06:26:07.637+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2025-01-18T06:26:07.654+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 1 MongoDB repository interface.
2025-01-18T06:26:07.810+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-01-18T06:26:07.816+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-01-18T06:26:07.816+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.34]
2025-01-18T06:26:07.830+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-01-18T06:26:07.830+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 397 ms
2025-01-18T06:26:07.904+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "5.2.1"}, "os": {"type": "Darwin", "name": "Mac OS X", "architecture": "aarch64", "version": "15.2"}, "platform": "Java/BellSoft/23.0.1+13"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=MongoCredential{mechanism=null, userName='yu71', source='admin', password=<hidden>, mechanismProperties=<hidden>}, transportSettings=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@1c5e764, com.mongodb.Jep395RecordCodecProvider@59d09060, com.mongodb.KotlinCodecProvider@4b8114a2]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[127.0.0.1:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverMonitoringMode=AUTO, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null, timeoutMS=null}
2025-01-18T06:26:07.911+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [127.0.0.1:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, cryptd=false, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=7396667, minRoundTripTimeNanos=0}
2025-01-18T06:26:07.954+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2025-01-18T06:26:08.055+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync", "version": "5.2.1"}, "os": {"type": "Darwin", "name": "Mac OS X", "architecture": "aarch64", "version": "15.2"}, "platform": "Java/BellSoft/23.0.1+13"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=MongoCredential{mechanism=null, userName='yu71', source='admin', password=<hidden>, mechanismProperties=<hidden>}, transportSettings=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@1c5e764, com.mongodb.Jep395RecordCodecProvider@59d09060, com.mongodb.KotlinCodecProvider@4b8114a2]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverMonitoringMode=AUTO, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=UNSPECIFIED, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null, timeoutMS=null}
2025-01-18T06:26:08.057+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, cryptd=false, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=1832917, minRoundTripTimeNanos=0}
2025-01-18T06:26:08.193+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Create Database Change Log Collection
2025-01-18T06:26:08.193+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Creating database history collection with name: customers.DATABASECHANGELOG
2025-01-18T06:26:08.205+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Created database history collection : customers.DATABASECHANGELOG
2025-01-18T06:26:08.205+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Adjusting database history Collection with name: customers.DATABASECHANGELOG
2025-01-18T06:26:08.205+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Adjusted database history Collection with name: customers.DATABASECHANGELOG
2025-01-18T06:26:08.233+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Create Database Lock Collection: customers.DATABASECHANGELOGLOCK
2025-01-18T06:26:08.241+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Created database lock Collection: DATABASECHANGELOGLOCK
2025-01-18T06:26:08.241+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Adjusting database Lock Collection with name: customers.DATABASECHANGELOGLOCK
2025-01-18T06:26:08.242+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Adjusted database Lock Collection with name: customers.DATABASECHANGELOGLOCK
2025-01-18T06:26:08.843+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Lock Database
2025-01-18T06:26:08.850+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Successfully Acquired Change Log Lock
2025-01-18T06:26:08.851+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.command                        : Using deploymentId: 7156368850
Running Changeset: db-json/00_initial-structure.json::drop-collection::hendisantika
2025-01-18T06:26:08.857+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Changeset db-json/00_initial-structure.json::drop-collection::hendisantika
2025-01-18T06:26:08.857+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Drop Collections if exists
2025-01-18T06:26:08.860+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : Collection customers dropped
2025-01-18T06:26:08.860+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : ChangeSet db-json/00_initial-structure.json::drop-collection::hendisantika ran successfully in 3ms
Running Changeset: db-json/00_initial-structure.json::create-collection::hendisantika
2025-01-18T06:26:08.865+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Changeset db-json/00_initial-structure.json::create-collection::hendisantika
2025-01-18T06:26:08.866+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Create Collections
2025-01-18T06:26:08.879+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : Collection customers created
2025-01-18T06:26:08.879+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : ChangeSet db-json/00_initial-structure.json::create-collection::hendisantika ran successfully in 14ms
Running Changeset: db-json/01_initial-data.json::insert-customers::hendisantika
2025-01-18T06:26:08.882+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Changeset db-json/01_initial-data.json::insert-customers::hendisantika
2025-01-18T06:26:08.882+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Insert base customer
2025-01-18T06:26:08.883+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : Documents inserted into collection customers
2025-01-18T06:26:08.883+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : ChangeSet db-json/01_initial-data.json::insert-customers::hendisantika ran successfully in 1ms
Running Changeset: db-json/01_initial-data.json::insert-owner::hendisantika
2025-01-18T06:26:08.884+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Changeset db-json/01_initial-data.json::insert-owner::hendisantika
2025-01-18T06:26:08.885+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Insert base customer owner
2025-01-18T06:26:08.886+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : Document inserted into collection customers
2025-01-18T06:26:08.886+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : ChangeSet db-json/01_initial-data.json::insert-owner::hendisantika ran successfully in 2ms
Running Changeset: db-json/01_initial-data.json::insert-test::hendisantika
2025-01-18T06:26:08.887+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Changeset db-json/01_initial-data.json::insert-test::hendisantika
2025-01-18T06:26:08.887+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.nosql                          : Insert base customer owner
2025-01-18T06:26:08.888+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : Document inserted into collection customers
2025-01-18T06:26:08.888+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.changelog                      : ChangeSet db-json/01_initial-data.json::insert-test::hendisantika ran successfully in 1ms

UPDATE SUMMARY
Run:                          5
Previously run:               0
Filtered out:                 0
-------------------------------
Total change sets:            5

2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : UPDATE SUMMARY
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : Run:                          5
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : Previously run:               0
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : Filtered out:                 0
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : -------------------------------
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : Total change sets:            5
2025-01-18T06:26:08.890+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.util                           : Update summary generated
2025-01-18T06:26:08.891+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.command                        : Update command completed successfully.
Liquibase: Update has been successful.
2025-01-18T06:26:08.891+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Release Database Lock
2025-01-18T06:26:08.894+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.ext                            : Successfully released change log lock
2025-01-18T06:26:08.897+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] liquibase.command                        : Command execution complete
2025-01-18T06:26:08.939+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2025-01-18T06:26:08.959+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2025-01-18T06:26:08.968+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2025-01-18T06:26:08.980+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2025-01-18T06:26:09.011+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-01-18T06:26:09.015+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [  restartedMain] .s.SpringBootMongodbLiquibaseApplication : Started SpringBootMongodbLiquibaseApplication in 6.231 seconds (process running for 6.491)
2025-01-18T06:26:18.305+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-01-18T06:26:18.305+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2025-01-18T06:26:18.305+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected StandardServletMultipartResolver
2025-01-18T06:26:18.305+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected AcceptHeaderLocaleResolver
2025-01-18T06:26:18.305+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected FixedThemeResolver
2025-01-18T06:26:18.306+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@32eb69aa
2025-01-18T06:26:18.306+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Detected org.springframework.web.servlet.support.SessionFlashMapManager@2006ec9
2025-01-18T06:26:18.306+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
2025-01-18T06:26:18.306+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2025-01-18T06:26:18.309+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : GET "/api/customer", parameters={}
2025-01-18T06:26:18.314+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped to ResourceHttpRequestHandler [classpath [META-INF/resources/], classpath [resources/], classpath [static/], classpath [public/], ServletContext [/]]
2025-01-18T06:26:18.318+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.w.s.r.ResourceHttpRequestHandler     : Resource not found
2025-01-18T06:26:18.321+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.servlet.resource.NoResourceFoundException: No static resource api/customer.]
2025-01-18T06:26:18.321+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed 404 NOT_FOUND
2025-01-18T06:26:18.324+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : "ERROR" dispatch for GET "/error", parameters={}
2025-01-18T06:26:18.325+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#errorHtml(HttpServletRequest, HttpServletResponse)
2025-01-18T06:26:18.340+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.w.s.v.ContentNegotiatingViewResolver : Selected 'text/html' given [text/html, text/html;q=0.8]
2025-01-18T06:26:18.343+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Exiting from "ERROR" dispatch, status 404
2025-01-18T06:26:22.537+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : GET "/api/customers", parameters={}
2025-01-18T06:26:22.538+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to id.my.hendisantika.springbootmongodbliquibase.customer.CustomerController#getAll()
2025-01-18T06:26:22.542+07:00  INFO 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] i.m.h.s.customer.CustomerController      : Get All customer
2025-01-18T06:26:22.609+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Using 'application/json;q=0.8', given [text/html, application/xhtml+xml, image/avif, image/webp, image/apng, application/xml;q=0.9, */*;q=0.8, application/signed-exchange;v=b3;q=0.7] and supported [application/json, application/*+json]
2025-01-18T06:26:22.610+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] m.m.a.RequestResponseBodyMethodProcessor : Writing [[Customer(id=678ae7109f820a824ff4e906, name=Yuji), Customer(id=678ae7109f820a824ff4e907, name=Megumi (truncated)...]
2025-01-18T06:26:22.615+07:00 DEBUG 22608 --- [spring-boot-mongodb-liquibase] [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed 200 OK

```

### List All Customers

```json
// 20250118062622
// http://localhost:8080/api/customers

[
  {
    "id": "678ae7109f820a824ff4e906",
    "name": "Yuji"
  },
  {
    "id": "678ae7109f820a824ff4e907",
    "name": "Megumi"
  },
  {
    "id": "678ae7109f820a824ff4e908",
    "name": "Gojo"
  },
  {
    "id": "678ae7109f820a824ff4e909",
    "name": "Naobara"
  },
  {
    "id": "678ae7109f820a824ff4e90a",
    "name": "Sukuna"
  },
  {
    "id": "678ae7109f820a824ff4e90b",
    "name": "Geto"
  },
  {
    "id": "678ae7109f820a824ff4e90c",
    "name": "Panda"
  },
  {
    "id": "678ae7109f820a824ff4e90d",
    "name": "Maki"
  },
  {
    "id": "678ae7109f820a824ff4e90e",
    "name": "Mai"
  },
  {
    "id": "678ae7109f820a824ff4e90f",
    "name": "Mechamaru"
  },
  {
    "id": "678ae7109f820a824ff4e910",
    "name": "Toge"
  },
  {
    "id": "678ae7109f820a824ff4e911",
    "name": "Aokutsu"
  },
  {
    "id": "678ae7109f820a824ff4e913",
    "name": "John Doe"
  },
  {
    "id": "678ae7109f820a824ff4e915",
    "name": "Jane Doe"
  }
]
```
