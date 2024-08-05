package br.com.infox.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", initialValue = 1, allocationSize = 1)
public class Cliente  implements Serializable {

    private static final long serialVersion= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    private Long idCliente;

    @Column(name="NAMECLI", nullable=false, length=50)
    private String nomeCliente;

    @Column(name="FONECLI", nullable=false, length=15)
    private String foneCliente;

    @Column(name="ENDCLI", length=100)
    private String enderecoCliente;

    @Column(name="MAILCLI", length=30)
    private String emailCliente;



}
