@echo off
set AXIS_HOME=c:\axis
set AXIS_LIB=%AXIS_HOME%\lib
set AXISCLASSPATH=%AXIS_LIB%\axis.jar;%AXIS_LIB%\axis-ant.jar;%AXIS_LIB%\commons-discovery-0.2.jar;%AXIS_LIB%\commons-logging-1.0.4.jar;%AXIS_LIB%\jaxrpc.jar;%AXIS_LIB%\saaj.jar;%AXIS_LIB%\log4j-1.2.8.jar;%AXIS_LIB%\wsdl4j-1.5.1.jar;"C:\Program Files\glassfish-4.0\glassfish\modules\javax.mail.jar";"C:\Program Files\NetBeans 7.3.1\ide\modules\ext\jaxb\activation.jar"

java -cp %AXISCLASSPATH% org.apache.axis.wsdl.WSDL2Java wsIndicadoresEconomicos.asmx.wsdl

PAUSE
