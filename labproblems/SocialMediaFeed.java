package week7.labproblems;

import java.time.LocalDateTime;

class SocialMediaPost {
    protected String author;
    protected String content;
    protected LocalDateTime time;

    public SocialMediaPost(String author, String content) {
        this.author = author;
        this.content = content;
        this.time = LocalDateTime.now();
    }

    public void display() {
        System.out.println(author + " posted: " + content + " at " + time);
    }
}

class InstagramPost extends SocialMediaPost {
    private int likes;
    private String hashtags;

    public InstagramPost(String author, String content, int likes, String hashtags) {
        super(author, content);
        this.likes = likes;
        this.hashtags = hashtags;
    }

    @Override
    public void display() {
        System.out.println("📸 Instagram Post by " + author);
        System.out.println(content);
        System.out.println("Likes: " + likes);
        System.out.println("Hashtags: " + hashtags);
        System.out.println("Posted at: " + time);
        System.out.println();
    }
}

class TwitterPost extends SocialMediaPost {
    private int retweets;

    public TwitterPost(String author, String content, int retweets) {
        super(author, content);
        this.retweets = retweets;
    }

    @Override
    public void display() {
        System.out.println("🐦 Tweet by @" + author);
        System.out.println(content + " (" + content.length() + " chars)");
        System.out.println("Retweets: " + retweets);
        System.out.println("Posted at: " + time);
        System.out.println();
    }
}

class LinkedInPost extends SocialMediaPost {
    private int connections;

    public LinkedInPost(String author, String content, int connections) {
        super(author, content);
        this.connections = connections;
    }

    @Override
    public void display() {
        System.out.println("💼 LinkedIn Post by " + author);
        System.out.println("--------------------------------------------------");
        System.out.println(content);
        System.out.println("Connections engaged: " + connections);
        System.out.println("Posted at: " + time);
        System.out.println("--------------------------------------------------\n");
    }
}

public class SocialMediaFeed {
    public static void main(String[] args) {
        SocialMediaPost insta = new InstagramPost("Alice", "Enjoying the beach!", 120, "#sunset #vacation");
        SocialMediaPost tweet = new TwitterPost("Bob", "Java is awesome!", 45);
        SocialMediaPost linkedIn = new LinkedInPost("Charlie", "Excited to start my new role at TechCorp!", 300);

        insta.display();
        tweet.display();
        linkedIn.display();
    }
}

