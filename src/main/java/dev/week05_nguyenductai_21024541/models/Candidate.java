package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Candidate {

    @Id
    @Column(name = "candidate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "full_name", length = 255, nullable = false)
    private String fullName;
    @Column(length = 15, nullable = false)
    private String phone;
    @Column(length = 255, unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidateSkillId.candidate")
    private List<CandidateSkill> candidateSkills;

    public Candidate(String fullName, String phone, String email, LocalDate dob, Address address) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.address = address;
    }
}
