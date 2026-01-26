FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Lệnh quan trọng: Tìm file jar trong target và đổi tên nó thành app.jar
RUN cp target/*.jar app.jar

EXPOSE 8080
# Chạy trực tiếp file app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]