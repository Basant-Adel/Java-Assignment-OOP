public class User {
    protected String userId;
    protected String username;
    protected String email;

    public User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public String getUserDetails() {
        return "User ID: " + userId + ", User Name: " + username + ", Email: " + email;
    }
}