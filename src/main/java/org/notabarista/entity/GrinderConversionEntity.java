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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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

    @Column(name = "grinder_about", columnDefinition="TEXT")
    private String aboutGrinder;

    @Column(name = "grinder_media_url", columnDefinition="TEXT")
    private String grinderMediaUrl;

    @Column(name = "grind_size")
    private String grindSize;

    @Column(name = "grinder_setting")
    private String grinderSetting;

    @ManyToMany(targetEntity = BrewingMethodEntity.class, fetch = FetchType.LAZY)
    @JoinTable(name = "grinder_conversion_brewing_method", joinColumns = {
            @JoinColumn(name = "grinder_conversion_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "brewing_method_id", referencedColumnName = "id")})
    @Fetch(value = FetchMode.SUBSELECT)
    private List<BrewingMethodEntity> grinderBrewingMethods;

}
