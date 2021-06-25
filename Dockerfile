FROM microsoft/iis:latest

COPY Add c:\\inetpub\Add

CMD ["powershell.exe", "c:\\inetpub\Add"]