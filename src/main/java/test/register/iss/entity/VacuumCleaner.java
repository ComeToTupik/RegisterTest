package test.register.iss.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vacuum_cleaner")
public class VacuumCleaner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "technic_id")
    private Technic aboutTechnic;

    @Column(name = "volume", nullable = false)
    private float volume;

    @Column(name = "number_modes", nullable = false)
    private int numberModes;
}
