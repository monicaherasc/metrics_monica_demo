package com.example.demo.sevice;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class GeneradorDeSaludosService {
    public String enEspanol() {
       return "HOLA MONICA";

    }
}
