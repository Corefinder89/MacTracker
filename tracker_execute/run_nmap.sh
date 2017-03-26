#!/bin/bash
#sudo -s <<EOF
#  DIR=mac_identifier
  echo Connected as ROOT
  /usr/local/nmap -sP -n -oX - 192.168.2.1/24 | tee nmap.xml
  echo "\n Dumping nmap data onto project directory......"
#EOF
