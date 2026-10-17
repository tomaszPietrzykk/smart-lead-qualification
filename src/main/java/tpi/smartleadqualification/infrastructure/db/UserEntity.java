package tpi.smartleadqualification.infrastructure.db;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String emailAddress;

    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<MessageEntity> messages = new ArrayList<>();
//    private final List<LeadEntity> leads;

}