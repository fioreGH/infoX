package br.com.infox.model;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USUARIO", uniqueConstraints= @UniqueConstraint(columnNames={"login"}))
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1,initialValue = 1)
public class Usuario implements Serializable {

    private static final long serialVersion= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long iduser;

    @Column(name="USUARIO", nullable=false, length=50)
    private String usuario;

    @Column(name="PHONE", length=15)
    private String fone;

    @Column(name="LOGIN", nullable=false, length=15)
    private String login;

    @Column(name="PASSW", nullable=false, length=15)
    private String senha;
}
