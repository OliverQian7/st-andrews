#!/bin/bash

javac W02Exercise2f.java
result=$(java W02Exercise2f)
echo "$result"
if [ "$result" = "a * b = -727379968" ] 
then 
	exit 1
else 
	exit 0
fi;
