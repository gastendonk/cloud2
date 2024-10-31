# cloud2 Git Repo

Projekte rund um Cloud Themen

## Neelix

Eine simple Java Swing Anwendung, die wir testweise in der Azure Cloud (Azure Virtual Desktop remoteapp)
betreiben wollen.

Build mit build.bat, Ergebnis dann in build/install/neelix, Start der Anwendung ueber bin/neelix.bat

Falls ein Installationspaket unbedingt notwendig ist, koennte man das mit der Inno Setup Datei setup.iss erzeugen.
Die Java Temurin 17 JRE .msi Datei muss als neelix\jre\OpenJDK17U-jre_x64_windows_hotspot_17.0.13_11.msi abgelegt werden.

https://adoptium.net/de/temurin/releases/?version=17&package=jre&arch=x64&os=windows
