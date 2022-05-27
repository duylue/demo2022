package com.example.demoorc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NamedStoredProcedureQueries({ //
        @NamedStoredProcedureQuery(name = "Cache.getCache", resultClasses = Cache.class, procedureName = "DUY1", parameters = { //
                @StoredProcedureParameter(name = "cs", mode = ParameterMode.REF_CURSOR, type = Void.class)}
             ) //
})
public class Cache {
    @Id
    @Column(name = "ID")
    private String ID;
}
