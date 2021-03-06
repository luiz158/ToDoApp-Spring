/*
 *  MIT License
 */
package aw2079.todoapp.Model.Entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "TASKLIST")
public class TaskList {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "taskList")
    private List<Task> tasks;

}
