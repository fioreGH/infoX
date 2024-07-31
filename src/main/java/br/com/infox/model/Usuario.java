package br.com.infox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name="USUARIO",
        uniqueConstraints=
        @UniqueConstraint(columnNames={"login"}))
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1,initialValue = 1)
public class Usuario implements Serializable {

    private static final long serialVersion= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long iduser;

    @NotNull
    private String usuario;

    private String fone;

    @NotNull
    private String login;

    @NotNull
    private String senha;
}
