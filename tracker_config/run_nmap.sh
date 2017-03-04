#!/bin/sh
sudo -s <<EOF
  DIR=mac_identifier
  echo Connected as ROOT
  /usr/local/bin/nmap -sP -n 192.168.2.* | tee nmap
  echo "Tranferring nmap data ......"
EOF
