package dev.week05_nguyenductai_21024541.models;

import dev.week05_nguyenductai_21024541.ernums.SkillLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "candidate_skill")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillId candidateSkillId;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "skill_level", columnDefinition = "TINYINT(4)", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000, nullable = false)
    private String moreInfo;

    public CandidateSkill(Candidate candidate, Skill skill, SkillLevel skillLevel, String moreInfo) {
        candidateSkillId = new CandidateSkillId(skill, candidate);
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }
}
