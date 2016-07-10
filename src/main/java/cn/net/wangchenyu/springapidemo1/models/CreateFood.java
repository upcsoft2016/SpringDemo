package cn.net.wangchenyu.springapidemo1.models;

import javax.persistence.*;

/**
 * Created by cheneyveron on 7/7/16.
 */
@Entity
@Table(name = "Food")
public class CreateFood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }
}
