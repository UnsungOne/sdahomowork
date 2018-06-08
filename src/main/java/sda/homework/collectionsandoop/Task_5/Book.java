package sda.homework.collectionsandoop.Task_5;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Book {
    private String title;
    private String uuid = UUID.randomUUID().toString();
}