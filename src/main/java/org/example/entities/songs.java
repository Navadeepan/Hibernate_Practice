package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// database class defined
@Entity
@Table(name = "song")
public class songs {

    @Id
    @Column(name= "id")
    private int id;

    @Column(name= "songname")
    private String songname;

    @Column(name= "singer")
    private String singer;

    public songs() {
    }

    @Override
    public String toString() {
        return "songs{" +
                "id=" + id +
                ", songname='" + songname + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public songs(int id, String songname, String singer) {
        this.id = id;
        this.songname = songname;
        this.singer = singer;
    }

    //getter and setter for the value to be inserted in database
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

}
