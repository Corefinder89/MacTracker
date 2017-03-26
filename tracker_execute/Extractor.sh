#!/bin/bash
DIR=mac_identifier
cd ..
if [ ! -d "$DIR" ]
then
  exit
else
  cd "$DIR"
  javac get_Mac_Device_name.java
  java get_Mac_Device_name
fi
