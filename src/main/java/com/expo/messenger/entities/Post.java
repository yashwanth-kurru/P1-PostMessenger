package com.expo.messenger.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    private String title;
    private String message;
    private int categoryId;
    private int postedById;
    private Date createdAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    @Fetch(FetchMode.SELECT)
    private List<PostChannelRelationship> channels;

}
