package com.test;
/**
 * @author zhzhouq
 * @date 2020-10-14 - 18:03
 */

import java.io.Serializable;
import java.util.Objects;

/**
 * 类名称: LeadEntity
 * 类描述：领导实体类
 * 创建时间: 2020-10-14 18:03
 * 创建人： zhzhouq
 * 版本： 1.0
 */
public class LeadEntity implements Serializable{
    private static final long serialVersionUID = -7332721393434029260L;

    private int Id =-1;               //ID
    private long orderId =-1L;               //orderID
    private String sName = "";      //领导名字
    private String jobTitle = "";   //职位名称

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getsName() {
        return sName;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LeadEntity(int id, String sName, String jobTitle) {
        this.Id = id;
        this.sName = sName;
        this.jobTitle = jobTitle;
    }

    public LeadEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeadEntity)) return false;
        LeadEntity that = (LeadEntity) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getsName(), that.getsName()) &&
                Objects.equals(getJobTitle(), that.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getsName(), getJobTitle());
    }

    @Override
    public String toString() {
        return "LeadEntity{" +
                "Id=" + Id +
                ", sName='" + sName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}