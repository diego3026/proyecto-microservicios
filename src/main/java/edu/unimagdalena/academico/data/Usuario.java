package edu.unimagdalena.academico.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "usuarios")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String password;
    private String passwordRepeat;
    private Boolean enabled;
    private String foto;
    private String rol;
    private LocalDateTime creado;

    @OneToMany(mappedBy = "usuario")
    private List<Sugerencia> sugerencias;

    @OneToMany(mappedBy = "usuario")
    private List<Mensaje> mensajes;

    @ManyToMany(mappedBy = "usuarios")
    private List<Partido> partidos;
}
