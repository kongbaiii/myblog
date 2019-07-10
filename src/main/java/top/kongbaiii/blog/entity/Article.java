package top.kongbaiii.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author kongbaiii
 */
@Entity
@Table(name = "tb_article")
@Data
public class Article {

    @Id
    private String id;

    private String title;

    private String image;

    private Date createtime;

    private Date updatetime;

    private String ispublic;

    private String istop;

    private Integer visits;

    private Integer thumbup;

    private Integer commentnum;

    private String categoryname;

    private String url;

    private String content;

}