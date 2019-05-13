package com.example.MysqlRest;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Cls {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String age;

}
