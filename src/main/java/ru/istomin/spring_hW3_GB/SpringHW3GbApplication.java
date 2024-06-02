package ru.istomin.spring_hW3_GB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 1. в пердыдущий проект (библиотека с книгами, выдача читателям) добавить следующие ресурсы,
 которые возвращают готовые html-страницы (т.е. это просто Controller'ы)
 1.1 /ui/books - на стронице должен отобразиться список всех доступных книг в системе
 1.2 /ui/reader - анологично 1.1
 1.3 /ui/issues - на странице отображаеться таблица, в которой есть столбцы (книга, читатель, когда взял, когда вернул(если не вернул - пустая ячейка)).
 1.4 /ui/reader/{id} - страница, где написано имя читателя с индификатором id и перечислины книги, которые на руках у него

 Чтобы шаблонизатор thymeleaf заработал нужно добавить зависемость в pom.xml

 <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf -->
 <dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-thymeleaf</artifactId>
 <version>3.3.0</version>
 </dependency>
 */
@SpringBootApplication
public class SpringHW3GbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHW3GbApplication.class, args);
	}

}
