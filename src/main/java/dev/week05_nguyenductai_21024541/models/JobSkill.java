package dev.week05_nguyenductai_21024541.models;

import dev.week05_nguyenductai_21024541.ernums.SkillLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job_skill")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class JobSkill {
    @EmbeddedId
    private JobSkillId jobSkillId;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "skill_level", columnDefinition = "TINYINT(4)", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 10000, nullable = false)
    private String moreInfo;

    public JobSkill(Job job, Skill skill, SkillLevel skillLevel, String moreInfo) {
        jobSkillId = new JobSkillId(job, skill);
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }
}
