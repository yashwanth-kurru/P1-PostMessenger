package com.expo.messenger.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class PostChannelRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int channelId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="post_id")
    private Post post;

}
