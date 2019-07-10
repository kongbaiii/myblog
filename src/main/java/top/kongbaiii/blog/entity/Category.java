package top.kongbaiii.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kongbaiii
 */
@Entity
@Table(name = "tb_category")
@Data
public class Category {

    @Id
    private Integer id;

    private String categoryname;

    private Integer totalartcile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getTotalartcile() {
        return totalartcile;
    }

    public void setTotalartcile(Integer totalartcile) {
        this.totalartcile = totalartcile;
    }
}