package io.security.corespringsecurity.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 자원
 */
@Entity
@Table(name = "RESOURCES")
@Data
@ToString(exclude = {"roleSet"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resources implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "resource_id")
    private Long id;

    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "http_method")
    private String httpMethod;

    @Column(name = "order_num")
    private int orderNum;

    @Column(name = "resource_type")
    private String resourceType;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ROLE_RESOURCES",
            joinColumns = {
                @JoinColumn(name = "resource_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "role_id")
            })
    private Set<Role> roleSet = new HashSet<>();
}
