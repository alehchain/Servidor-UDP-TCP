from socket import *

s = socket(AF_INET, SOCK_DGRAM)
s.bind(('', 12000))

message, clientAddress = s.recvfrom(1024)
if message:
    print(message.decode(), " says Client")

s.close()
