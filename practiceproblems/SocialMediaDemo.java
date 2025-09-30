package week7.practiceproblems;

 class SocialMediaPost {
    protected String content;
    protected String author;
    public SocialMediaPost(String content, String author) {
        this.content = content;
        this.author = author;
    }




    public void share() {
        System.out.println("Sharing content: " +  content + " by author: " + author);
// ... (implementation)
    }
}
class InstagramPost extends SocialMediaPost {
    private int likes;
    public InstagramPost(String content, String author, int likes) {
        super(content, author);
        this.likes = likes;
    }

    @Override
    public void share() {
        System.out.println("Instagram content: " +  content + "  by author: " + author + " likes: "+ likes);
// ... (implementation)
    }
}
 class TwitterPost extends SocialMediaPost {
    private int retweets;
    public TwitterPost(String content, String author, int retweets) {
        super(content, author);
        this.retweets = retweets;
    }

    @Override
    public void share() {
            System.out.println("Twitter content: " + content+ " by author : " + author+ " , retweets: " +  retweets);
// ... (implementation)
    }
}



public class SocialMediaDemo {
    public static void main(String[] args) {
// TODO: Social Media Feed Simulation:
// 1. Create array of SocialMediaPost references
        SocialMediaPost[] socialMediaPosts = {new InstagramPost("Sunset vibes!", "john_doe", 245),
        new TwitterPost("Java is awesome!", "code_ninja", 89),
        new SocialMediaPost("Hello world!", "beginner")};

        for (SocialMediaPost socialMediaPost : socialMediaPosts) {
            socialMediaPost.share();
        }
    }
}
