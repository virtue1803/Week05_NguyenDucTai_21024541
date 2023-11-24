package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@ToString
public class JobSkillId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    private Skill skill;

    public JobSkillId(Job job, Skill skill) {
        this.job = job;
        this.skill = skill;
    }
}