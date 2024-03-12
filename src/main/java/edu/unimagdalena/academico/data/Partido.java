package edu.unimagdalena.academico.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "partidos")
public class Partido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creador;
    private String deporte;
    private String ciudad;
    private String provincia;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    @Temporal(TemporalType.TIME)
    private LocalTime horaComienzo;
    @Temporal(TemporalType.TIME)
    private LocalTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

    @ManyToMany()
    @JoinTable(name = "partidos_usuarios",joinColumns = @JoinColumn(name = "idPartido",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "idUsuario",referencedColumnName = "id"))
    private List<Usuario> usuarios;
}
