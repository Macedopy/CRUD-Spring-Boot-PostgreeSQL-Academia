package me.dio.academia.digital.entity;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="tb_avaliacoes")

public class AvaliacaoFisica {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL) //Muitas avaliações só tem um aluno "Any"
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
    
    @Column(name="peso_atual")
    private double peso;
    
    @Column(name = "altura_atual")
    private double altura;
}
