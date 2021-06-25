FROM microsoft/iis:latest

COPY JavaAdd c:\\JavaAdd

CMD ["powershell.exe", "c:\\JavaAdd"]
