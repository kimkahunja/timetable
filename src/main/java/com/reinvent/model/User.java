package com.reinvent.model;

public class User extends UserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userName
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.picture
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    private String picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userName
     *
     * @return the value of user.userName
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userName
     *
     * @param username the value for user.userName
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.picture
     *
     * @return the value of user.picture
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.picture
     *
     * @param picture the value for user.picture
     *
     * @mbggenerated Thu Jun 11 19:52:24 EAT 2015
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}