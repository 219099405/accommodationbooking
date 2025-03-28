/*
User POJO
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei.domain;

public class User {
    private String userId;
    private String userName;
    private String email;
    private String password;



    private User(){}

    private User(Builder builder){
        this.userId= builder.userId;
        this.userName = builder.userName;
        this.email = builder.email;
        this.password = builder.password;
    }
    public String getUserId() {
            return userId;
        }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {return email;}
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private String userId;
        private String userName;
        private String email;
        private String password;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;

        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public User build() { return new User(this);}


    }
}
