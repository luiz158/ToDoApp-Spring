/*
 *  MIT License
 */
package aw2079.todoapp.Model.Entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Artur Wiśniewski
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "TYPE")
public class Type {

    @Id
    private String type;

    @OneToMany(mappedBy = "type")
    private List<Task> task;
}
