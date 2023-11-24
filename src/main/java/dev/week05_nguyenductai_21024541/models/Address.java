package dev.week05_nguyenductai_21024541.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 150, nullable = false)
    private String street;
    @Column(length = 50, nullable = false)
    private String city;
    @Column(columnDefinition = "SMALLINT(6)", nullable = false)
    private short country;
    @Column(length = 20, nullable = false)
    private String number;
    @Column(length = 7, nullable = false)
    private String zipCode;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private List<Company> companies;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private List<Candidate> candidates;

    public Address(String street, String city, short country, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipCode = zipCode;
    }
}
