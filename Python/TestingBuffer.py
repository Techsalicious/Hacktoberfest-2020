#!/usr/bin/python
import sys
import os
import socket 

host = sys.argv[1]
port = int(sys.argv[2])

# Testing
buffer = "\x41"*500

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
con = s.connect((host, port))
s.send(buffer)
s.close()