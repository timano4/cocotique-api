FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Thêm dòng này để đổi tên file jar cho cố định
RUN mv target/*.jar app.jar

EXPOSE 8080
# Chạy trực tiếp file app.jar đã đổi tên
ENTRYPOINT ["java", "-jar", "app.jar"]