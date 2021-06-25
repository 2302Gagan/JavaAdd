FROM microsoft/iis:latest

COPY JavaAdd c:\\inetpub\JavaAdd

CMD ["powershell.exe", "c:\\inetpub\JavaAdd"]
