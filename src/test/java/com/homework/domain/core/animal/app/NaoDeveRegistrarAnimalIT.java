package com.homework.domain.core.animal.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.domain.core.animal.model.Sexo;
import com.homework.domain.shared.Nome;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static com.homework.domain.core.animal.usecase.RegistrarAnimalUseCase.RegistrarAnimal;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
@SpringBootTest
@AutoConfigureMockMvc
public class NaoDeveRegistrarAnimalIT {

    private final String PATH = "/animais";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void deveRegistrarAnimal() throws Exception {

        RegistrarAnimal command = RegistrarAnimal.builder()
                .sexo(Sexo.MACHO)
                .build();

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsBytes(command)))
                .andExpect(status().isBadRequest());

    }
}
