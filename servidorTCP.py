from socket import *

s = socket(AF_INET, SOCK_STREAM)
s.bind(('', 12000))

s.listen(1)
conn, ender = s.accept()

data = conn.recv(1024)
if data:
    print(data.decode(), " says Client")

conn.close()
