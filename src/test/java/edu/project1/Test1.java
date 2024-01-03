package edu.project1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;

public class Test1 {
    @Test
    @DisplayName("Тест генерации слова")
    void word_change() throws IOException {
        for(int i = 0; i < 10; i++) {
            System.out.println(Project1.wordChange());
        }
    }
}
