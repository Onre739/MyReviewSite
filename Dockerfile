# Základní image s Javou (použijte verzi, kterou potřebujete)
FROM eclipse-temurin:21-jre

# Zkopírujte JAR do kontejneru
COPY target/MyReviewSite-0.0.1-SNAPSHOT.jar /app.jar

# Spusťte aplikaci
CMD ["java", "-jar", "/app.jar"]