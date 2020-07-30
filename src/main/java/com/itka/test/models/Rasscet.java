package com.itka.test.models;

import com.itka.test.webclass.Primer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rasscet  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String stroka;
    public String Number1;
    public String Number2;
    public char operator;
    public String result;

    public Rasscet() {

    }
    public Rasscet(String stroka, Primer b)
    {
        this.stroka =stroka;
        this.Number1=Integer.toString(b.a1);
        this.Number2=Integer.toString(b.b2);
        this.operator=b.op;
        this.result=Integer.toString(b.res);

    }


}
