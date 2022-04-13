package com.expo.messenger.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int channelId;

    @Column(nullable = false)
    private String channelName;

    private String channelDescription;

    @ManyToMany(mappedBy = "channels")
    @JsonManagedReference
    @ToString.Exclude
    private List<Post> posts;


}
