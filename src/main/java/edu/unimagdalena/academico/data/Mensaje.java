package edu.unimagdalena.academico.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "mensajes")
public class Mensaje {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creador;
    private String destinario;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "idUsuario",nullable = false)
    private Usuario usuario;
}
