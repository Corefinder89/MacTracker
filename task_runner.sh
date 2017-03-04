#!/bin/sh
DIR=mac_identifier
cd /Users/soumyajit/Documents/git_repos/target_mac/tracker_config
./Users/soumyajit/Documents/git_repos/target_mac/tracker_config/run_nmap.sh
if [ ! -d "$DIR" ]
then
  exit
else
  cd "$DIR"
  javac get_Mac_Device_name.java
  java get_Mac_Device_name
fi
