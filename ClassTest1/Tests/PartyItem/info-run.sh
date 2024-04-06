#!/bin/bash

export CLASSPATH=.:${TESTDIR}:${TESTDIR}/*

#javac ${TESTDIR}/*.java

java ClassTest1FeedbackGenerator
