#!/bin/sh
sudo -s <<EOF
echo Connected as ROOT
  nmap -sP -n 192.168.2.* | tee nmap.txt
EOF
