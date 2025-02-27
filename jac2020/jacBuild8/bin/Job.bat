echo off
echo ******************************************
echo JAC2020 v20191012a Job.bat

echo Job.bat 1=%1
echo Job.bat 2=%2
echo Job.bat 3=%3
echo Job.bat 4=%4

set MEMORY=-Xms64m -Xmx512m

if "%JAC_DEBUG_LEVEL%" == "" set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug 4 -debugClass 4
if NOT "%JAC_DEBUG_LEVEL%" == "" set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug %JAC_DEBUG_LEVEL% -debugClass %JAC_DEBUG_LEVEL%

set PROFILE=
if "%JAC_PROFILE%" == "true" set PROFILE=-Xrunjprofiler -Xint -Xbootclasspath/a:"C:\Program Files\jprofiler3\bin\agent.jar"

set DEBUG=
if "%JAC_DEBUG%" == "true" set DEBUG=-Dorg.xml.sax.driver=com.bluecast.xml.Piccolo -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=y

set COMPILE=
if "%JAC_COMPILE%" == "false" set COMPILE=-nocompile

if not "%1" == "jac" goto jrun
"%JAVA_HOME%\bin\java" %MEMORY% %PROFILE% %DEBUG% com.esarks.jac.jac %COMPILE% -script %2 -method %3 -context %4 -home "%JAC_BUILD%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%
goto exit

:jrun
if %3 == "" "%JAVA_HOME%\bin\java" %MEMORY% %PROFILE% %DEBUG% com.esarks.jac.jac %COMPILE% -script com.esarks.jac.jrun.Job -method execute -argument %1 -argument %2 -home "%JAC_BUILD%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%
if NOT %3 == "" "%JAVA_HOME%\bin\java" %MEMORY% %PROFILE% %DEBUG% com.esarks.jac.jac %COMPILE% -script com.esarks.jac.jrun.Job -method execute -argument %1 -argument %2 -argument %3 -home "%JAC_BUILD%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%

:exit
