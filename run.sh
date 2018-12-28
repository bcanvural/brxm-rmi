#!/usr/bin/env bash
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=8000 -jar target/brxm-rmi-1.0-SNAPSHOT-jar-with-dependencies.jar