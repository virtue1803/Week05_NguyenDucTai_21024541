package dev.week05_nguyenductai_21024541.models;

import dev.week05_nguyenductai_21024541.ernums.SkillType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Skill {
    @Id
    @Column(name = "skill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "skill_name", nullable = false)
    private String skillName;
    @Column(name = "skill_description", nullable = false)
    private String skillDescription;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type", columnDefinition = "TINYINT(4)", nullable = false)
    private SkillType skillType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSkillId.skill")
    private List<JobSkill> jobSkills;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidateSkillId.skill")
    private List<CandidateSkill> candidateSkills;

    public Skill(String skillName, String skillDescription, SkillType skillType) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.skillType = skillType;
    }
}
