package services.webplus.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>(); 
}
