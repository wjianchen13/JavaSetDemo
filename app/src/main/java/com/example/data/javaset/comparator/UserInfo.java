package com.example.data.javaset.comparator;

/**
 * 用户信息实体类
 * @author pan_junbiao
 **/
public class UserInfo
{
    private int userId; //用户编号
    private String userName; //用户名称
    private int age; //年龄
    private String blogInfo; //博客信息

    //构造函数
    public UserInfo(int userId, String userName, int age, String blogInfo)
    {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.blogInfo = blogInfo;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBlogInfo()
    {
        return blogInfo;
    }

    public void setBlogInfo(String blogInfo)
    {
        this.blogInfo = blogInfo;
    }

    @Override
    public String toString()
    {
        return "用户编号：" + this.userId + " 用户名称：" + this.userName
                +  " 年龄：" + this.age + " 博客信息：" + this.blogInfo;
    }
}