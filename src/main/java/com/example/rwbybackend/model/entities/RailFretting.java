package com.example.rwbybackend.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "rail_fretting")
public class RailFretting {
    @Id
    @Column(name = "fretting_id", nullable = false)
    private long frettingId;
    @Column(name = "vertical_fretting")
    private int verticalFretting;
    @Column(name = "active_side_fretting")
    private int activeSideFretting;
    @Column(name = "inactive_side_fretting")
    private int inactiveSideFretting;
    @Column(name = "crush_clinch")
    private int crushClinch;
    @Column(name = "ripply_fretting")
    private int ripplyFretting;
    @Column(name = "fusing_date")
    private LocalDate fusingDate;
    @Column(name = "polish_date")
    private LocalDate polishDate;
    @Column(name = "polish_kind")
    private LocalDate polishKind;
    @Column(name = "defect_code")
    private long defectCode;
    @Column(name = "clamp_kind")
    private String clampKind;
    @Column(name = "tonnage_before")
    private long tonnageBefore;
    @Column(name = "tonnage_after")
    private long tonnageAfter;

}
