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
@Table(name = "smartphone")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "technic_id")
    private Technic aboutTechnic;

    @Column(name = "memory", nullable = false)
    private int memory;

    @Column(name = "count_cameras", nullable = false)
    private short countCameras;
}
