#!/bin/bash
sudo -s <<EOF
  DIR=mac_identifier
  echo Connected as ROOT
  nmap -sP -n -oX - 192.168.2.1/24 > nmap.xml
  echo "\n Dumping nmap data onto project directory......"
EOF
