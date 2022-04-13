package com.expo.messenger.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    private String title;
    private String message;
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToMany
    @JoinTable(
        name = "post_channel_relationship",
        joinColumns ={ @JoinColumn(name = "post_id")},
        inverseJoinColumns = {@JoinColumn(name = "channel_id")}
    )
    @JsonBackReference
    @ToString.Exclude
    private List<Channel> channels;

}
