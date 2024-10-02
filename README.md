# cloud2 Git Repo

Projekte rund um Cloud Themen

## Neelix

Eine simple Java Swing Anwendung, die wir testweise in der Azure Cloud (RemoteApp, AVD)
betreiben wollen.

Build mit build.bat, Ergebnis dann in build/install/neelix, Start der Anwendung über bin/neelix.bat

Auf der Cloud VM muss zuvor noch das Java 17 Temurin JRE installiert werden. https://adoptium.net/de/temurin/releases/?version=17&package=jre&arch=x64&os=windows

Falls ein Installationspaket unbedingt notwendig ist, könnte man das mit der Inno Setup Datei setup.iss erzeugen.
