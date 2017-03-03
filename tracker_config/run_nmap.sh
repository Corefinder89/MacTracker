#!/bin/sh
sudo -s <<EOF
  echo Connected as ROOT
  nmap -sP -n 192.168.0.* | tee nmap.txt
  cd ../mac_identifier
  echo Connected to mac_identifier
EOF
