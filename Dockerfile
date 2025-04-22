FROM eclipse-temurin:21-jre

# 1. Vytvořte pracovní adresář
WORKDIR /app

# 2. Zkopírujte JAR a databázi
COPY target/MyReviewSite-*.jar app.jar
COPY MyReviewSiteDB.db ./

# 3. Nastavte práva pro zápis
RUN chmod a+rw MyReviewSiteDB.db

# 4. Spusťte aplikaci s produkčním profilem
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]