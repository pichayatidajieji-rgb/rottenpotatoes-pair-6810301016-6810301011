package th.ac.cdti.rottenpotatoes.domain;

public record Moviegoer(String name, String email) {

    public Moviegoer {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
    }
}