package kg.internet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="provider")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",nullable = false,unique = true)
    private String name;
    @Column(name="internet_fee",nullable =false)
    private Integer fee;
    @OneToMany
    @JoinColumn(name="client_id",nullable = false)
    private Client client;
}
