#!/bin/bash
path=$PWD

# Compile java file

hadoop com.sun.tools.javac.Main Native1.java
jar cf NT1.jar Native1*.class

hadoop com.sun.tools.javac.Main Native2.java Cluster*
jar cf NT2.jar Native2*.class Cluster*.class

#javac Native3.java
