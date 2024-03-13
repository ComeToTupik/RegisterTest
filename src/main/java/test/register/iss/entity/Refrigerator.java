package test.register.iss.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "refrigerator")
public class Refrigerator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "technic_id")
    private Technic aboutTechnic;

    @Column(name = "count_doors", nullable = false)
    private short countDoors;

    @Column(name = "type_compressor", length = 256, nullable = false)
    private String typeCompressor;
}
