package test.register.iss.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "technic")
public class Technic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 256, nullable = false)
    private String name;

    @Column(name = "serial_number", unique = true, nullable = false)
    private long serialNumber;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "country_manufacture", nullable = false, length = 128)
    private String countryManufacture;

    @Column(name = "company_manufacture", nullable = false, length = 128)
    private String companyManufacture;

    @Column(name = "type", length = 256, nullable = false)
    private String type;

    @Column(name = "color", length = 256, nullable = false)
    private String color;

    @Column(name = "dimensions", length = 128, nullable = false)
    private String dimensions;

    @Column(name = "order_online", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean orderOnline;

    @Column(name = "installment_plan", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean installmentPlan;

    @Column(name = "availability", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean availability;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
