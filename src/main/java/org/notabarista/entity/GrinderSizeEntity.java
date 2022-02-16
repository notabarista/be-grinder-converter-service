package org.notabarista.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, exclude = {})
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "grinder_sizes")
public class GrinderSizeEntity extends AbstractAuditedEntity {

    @Column(name = "grinder", nullable = false, updatable = false, insertable = false)
    private UUID grinder;

    @Column(name = "grind_size")
    private String grindSize;

    @Column(name = "clicks_per_round")
    private String clicksPerRound;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grinder", referencedColumnName = "id")
    private GrinderConversionEntity grinderConversion;

}
