package org.example.publisher.impl.issue;

import org.example.publisher.impl.creator.Creator;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "tbl_issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    BigInteger id;

    @JoinColumn(name = "creator_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Creator creator;

    @Column(name = "title", unique = true)
    @Length(min = 2, max = 64)
    String title;

    @Column(name = "content", nullable = false)
    String content;

    @Column(name = "modified")
    private Date modified;

    @Column(name = "created")
    private Date created;
}
