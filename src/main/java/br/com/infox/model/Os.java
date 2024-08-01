package br.com.infox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.PrivilegedAction;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "os_seq", sequenceName = "os_seq", initialValue = 1, allocationSize = 1)
public class Os implements Serializable {

    private static final long serialVersion= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "os_seq")
    private Float ordemDeServico;

    @CreationTimestamp
    private LocalDateTime createdDateTime;

    @Column(name="EQUIPO", nullable=false, length=150)
    private String equipamento;

    @Column(name="DEF", nullable=false, length=150)
    private String defeito;

    @Column(name="TECRESP", nullable=false, length=30)
    private String tecnicoResposavel;

    @Column(name = "VALOR", scale = 2, precision = 10)
    private BigDecimal valor;

    /*@ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "IDCLIENTE"))
    private Long idCliente; */




}
