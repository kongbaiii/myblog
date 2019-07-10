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
@Table(name = "tb_user")
@Data
public class User {
    @Id
    private String id;

    private String email;

    private String password;

    private String nickname;

    private String sex;

    private Date birthday;

    private String avatar;

    private String mobile;

    private Date regdate;

    private Date updatedate;

    private Integer fanscount;

    private Integer followcount;

}