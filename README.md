Прототип приложения на Spring Boot, которое через java.lang.Runtime запускает скрипт (./random_numbers.py) и выводит его на страницу

Используется Docker image openkbs/jdk-mvn-py3, который включает в себя OpenJDK 11 и Python 3.6

Скрипт ./random_numbers.py генерирует 3 случайных числа в промежутке от 0 до 1, приложение Spring Boot выводит их на endpoint localhost:8080

Для запуска выполняем mvn clean install, затем docker compose up -d