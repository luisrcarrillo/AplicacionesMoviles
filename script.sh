#!/bin/bash
#-*- ENCODING: UTF-8 -*-
clear
javac hello.java
javah -jni hello
gcc -I/usr/lib/jvm/java-6-openjdk/include -o libhello.so -shared hello.c
java -Djava.library.path=`pwd` hello
exit
