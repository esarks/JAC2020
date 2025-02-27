echo off
echo Running... C:\GitHub\ArchitectsCompanion\jac2020\bin\SetJob.bat v20191013a

set JAC_HOME=%JAC_BASE%
set JAC_WORK=%JAC_BASE%\classes
set JAC_SCRIPTS=%JAC_BASE%\app
rem - use below for jackbuild8 Make
rem set JAC_SCRIPTS="C:\GitHub\ArchitectsCompanion\jac2020\jacBuild8\source\scripts"

rem -- Jac
if exist "%JAC_HOME%\lib\jac\jac.jar" (
echo "%JAC_HOME%\lib\jac\jac.jar" exists
) else (
echo "%JAC_HOME%\lib\jac\jac.jar" failed
pause
)
if exist "%JAC_HOME%\lib\mic\mic.jar" (
echo "%JAC_HOME%\lib\mic\mic.jar" exists
) else (
echo "%JAC_HOME%\lib\mic\mic.jar" failed
pause
)
set CLASSPATH=%JAC_WORK%
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jac\jac.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mic\mic.jar

rem -- Jetty
if exist "%JAC_HOME%\lib\jetty\org.mortbay.jetty.jar" (
echo "%JAC_HOME%\lib\jetty\org.mortbay.jetty.jar" exists
) else (
echo "%JAC_HOME%\lib\jetty\org.mortbay.jetty.jar" failed
pause
)
if exist "%JAC_HOME%\lib\jetty\org.mortbay.jmx.jar" (
echo "%JAC_HOME%\lib\jetty\org.mortbay.jmx.jar" exists
) else (
echo "%JAC_HOME%\lib\jetty\org.mortbay.jmx.jar" failed
pause
)
if exist "%JAC_HOME%\lib\jetty\javax.servlet.jar" (
echo "%JAC_HOME%\lib\jetty\javax.servlet.jar" exists
) else (
echo "%JAC_HOME%\lib\jetty\javax.servlet.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\org.mortbay.jetty.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\org.mortbay.jmx.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\javax.servlet.jar

rem -- Java Tools
if exist "%JAVA_HOME%\lib\tools.jar" (
echo "%JAVA_HOME%\lib\tools.jar" exists
) else (
echo "%JAVA_HOME%\lib\tools.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar

rem -- MYSQL
if exist "%JAC_HOME%\lib\mysql-connector-java-5.1.18\mysql-connector-java-5.1.18-bin.jar" (
echo "%JAC_HOME%\lib\mysql-connector-java-5.1.18\mysql-connector-java-5.1.18-bin.jar" exists
) else (
echo "%JAC_HOME%\lib\mysql-connector-java-5.1.18\mysql-connector-java-5.1.18-bin.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mysql-connector-java-5.1.18\mysql-connector-java-5.1.18-bin.jar

rem -- MS SQLServer
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\msbase.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\mssqlserver.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\msutil.jar

rem -- Apache Tomcat
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\tomcat\servlet-api.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\tomcat\jsp-api.jar

rem -- PlantUML
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\plantuml\plantuml-epl-1.2019.0.jar

rem -- Crimson XML parser
if exist "%JAC_HOME%\lib\crimson\crimson.jar" (
echo "%JAC_HOME%\lib\crimson\crimson.jar" exists
) else (
echo "%JAC_HOME%\lib\crimson\crimson.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\crimson\crimson.jar

rem C:\GitHub\ArchitectsCompanion\jac2020\lib\jacob-1.19\jacob-1.19

rem -- Jacob
if exist "%JAC_HOME%\lib\jacob-1.19\jacob.jar" (
echo "%JAC_HOME%\lib\jacob-1.19\jacob.jar" exists
) else (
echo "%JAC_HOME%\lib\jacob-1.19\jacob.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jacob-1.19\jacob.jar

rem -- jni4net
if exist "%JAC_HOME%\lib\jni4net-0.8.6.0-bin\lib\jni4net.j-0.8.6.0.jar" (
echo "%JAC_HOME%\lib\jni4net-0.8.6.0-bin\lib\jni4net.j-0.8.6.0.jar" exists
) else (
echo "%JAC_HOME%\lib\jni4net-0.8.6.0-bin\lib\jni4net.j-0.8.6.0.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jni4net-0.8.6.0-bin\lib\jni4net.j-0.8.6.0.jar

rem -- javax.json
rem if exist "%JAC_HOME%\lib\javax.json-1.0\javax.json-1.0.jar" (
rem echo "%JAC_HOME%\lib\javax.json-1.0\javax.json-1.0.jar" exists
rem ) else (
rem echo "%JAC_HOME%\lib\javax.json-1.0\javax.json-1.0.jar" failed
rem pause
rem )
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\javax.json-1.0\javax.json-1.0.jar

rem -- JSON from JSON.org
rem if exist "%JAC_HOME%\lib\java-json.jar\java-json.jar" (
rem echo "%JAC_HOME%\lib\java-json.jar\java-json.jar" exists
rem ) else (
rem echo "%JAC_HOME%\lib\java-json.jar\java-json.jar" failed
rem pause
rem )
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\java-json.jar\java-json.jar

rem -- JSON Simple from JSON.org
if exist "%JAC_HOME%\lib\json-simple-1.1.jar\json-simple-1.1.jar" (
echo "%JAC_HOME%\lib\\json-simple-1.1.jar\json-simple-1.1.jar" exists
) else (
echo "%JAC_HOME%\lib\\json-simple-1.1.jar\json-simple-1.1.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\json-simple-1.1.jar\json-simple-1.1.jar

rem -- HAPI Libraries
if exist "%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-base-2.2.jar" (
echo "%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-base-2.2.jar" exists
) else (
echo "%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-base-2.2.jar" failed
pause
)
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-base-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-examples-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-hl7overhttp-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v21-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v22-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v23-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v231-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v24-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v25-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v251-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\hapi-structures-v26-2.2.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\log4j-1.2.17.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\slf4j-api-1.6.6.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\hapi-dist-2.2-all\lib\slf4j-log4j12-1.6.6.jar

echo %CLASSPATH% > classpath.txt

