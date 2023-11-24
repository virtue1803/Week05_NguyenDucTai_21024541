package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "company")

public class Company {
    @Id
    @Column(name = "comp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "comp_name", length = 255, nullable = false)
    private String companyName;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;
    @Column(length = 2000, nullable = false)
    private String about;
    @Column(name = "web_url")
    private String webURL;
    @ManyToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Job> jobs;
}
