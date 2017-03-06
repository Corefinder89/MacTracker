#!/bin/sh
sudo -s <<EOF
  DIR=mac_identifier
  echo Connected as ROOT
  /usr/local/bin/nmap -sP -n -oX - 192.168.2.1/24 | tee nmap.xml
  echo "Tranferring nmap data ......"
EOF
