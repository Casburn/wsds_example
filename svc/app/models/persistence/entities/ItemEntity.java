package models.persistence.entities;

import javax.persistence.*;

/**
 * Created by a614407 on 18/01/2016.
 */
@Table(name = "project")
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String summary;

}
