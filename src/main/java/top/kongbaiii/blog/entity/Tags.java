package top.kongbaiii.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kongbaiii
 */
@Entity
@Table(name = "tb_tags")
@Data
public class Tags {

    @Id
    private Integer id;

    private String tagname;

    private Integer totalartcile;

}