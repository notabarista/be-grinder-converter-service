package org.notabarista.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, exclude = {})
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "grinder_conversions")
public class GrinderConversionEntity extends AbstractAuditedEntity {

    @Column(name = "grinder")
    private String grinder;

    @Column(name = "grinder_about")
    private String aboutGrinder;

    @Column(name = "grinder_media_url")
    private String grinderMediaUrl;

    @Column(name = "clicks_per_round")
    private String clicksPerRound;

    @OneToMany(targetEntity = GrinderSizeEntity.class, mappedBy = "grinderConversion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("grinderConversion")
    private List<GrinderSizeEntity> grinderSizes;

}
