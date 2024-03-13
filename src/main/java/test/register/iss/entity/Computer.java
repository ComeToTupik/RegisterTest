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
@Table(name = "personal_computer")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "technic_id")
    private Technic aboutTechnic;

    @Column(name = "category", length = 256, nullable = false)
    private String category;

    @Column(name = "type_processor", length = 256, nullable = false)
    private String typeProcessor;
}
