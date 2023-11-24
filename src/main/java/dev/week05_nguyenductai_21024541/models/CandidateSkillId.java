package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
public class CandidateSkillId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidate_id")
    private Candidate candidate;

    public CandidateSkillId(Skill skill, Candidate candidate) {
        this.skill = skill;
        this.candidate = candidate;
    }
}
