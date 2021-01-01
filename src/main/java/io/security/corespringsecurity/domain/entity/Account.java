package io.security.corespringsecurity.domain.entity;
/**
 * 회원
 */

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@ToString(exclude = {"password", "userRoles"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Account implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private int age;

    @Column
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "ACCOUNT_ROLES",
        joinColumns = {
            @JoinColumn(name = "account_id")
        },
        inverseJoinColumns = {
            @JoinColumn(name = "role_id")
        })
    private Set<Role> userRoles = new HashSet<>();
}
