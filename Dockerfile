# Použijeme základní obraz s OpenJDK 17
FROM openjdk:21-jdk-slim

# Nastavíme pracovní adresář
WORKDIR /app

# Zkopírujeme JAR soubor (po buildu ho najdeme v target/)
COPY target/*.jar app.jar

# Příkaz, kterým se aplikace spustí
ENTRYPOINT ["java", "-jar", "app.jar"]
