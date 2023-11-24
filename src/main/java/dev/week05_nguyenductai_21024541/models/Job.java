package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "job")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Job {
    @Id
    @Column(name = "job_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "job_name", nullable = false)
    private String jobName;
    @Column(name = "job_desc", length = 2000, nullable = false)
    private String jobDescription;
    @ManyToOne
    @JoinColumn(name = "company", nullable = false)
    private Company company;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSkillId.job")
    private List<JobSkill> jobSkills;

    public Job(String jobName, String jobDescription, Company company) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.company = company;
    }
}