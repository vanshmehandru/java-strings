package week7.labproblems;

class Content {
    protected String title;

    public Content(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing: " + title);
    }

    public void stop() {
        System.out.println("Stopped: " + title);
    }
}

class Movie extends Content {
    private double rating;
    private int duration; // minutes

    public Movie(String title, double rating, int duration) {
        super(title);
        this.rating = rating;
        this.duration = duration;
    }

    public void showSubtitles() {
        System.out.println("Showing subtitles for " + title);
    }

    public void displayInfo() {
        System.out.println("Movie: " + title + ", Rating: " + rating + ", Duration: " + duration + " mins");
    }
}

class TVSeries extends Content {
    private int seasons;
    private int episodes;

    public TVSeries(String title, int seasons, int episodes) {
        super(title);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public void nextEpisodeSuggestion() {
        System.out.println("Next episode of " + title + " is ready to watch.");
    }

    public void displayInfo() {
        System.out.println("TV Series: " + title + ", Seasons: " + seasons + ", Episodes: " + episodes);
    }
}

class Documentary extends Content {
    private String tag;

    public Documentary(String title, String tag) {
        super(title);
        this.tag = tag;
    }

    public void relatedContent() {
        System.out.println("Related documentaries for " + title + " tagged as " + tag);
    }

    public void displayInfo() {
        System.out.println("Documentary: " + title + ", Tag: " + tag);
    }
}

public class StreamingPlatform {
    public static void main(String[] args) {
        Content[] watchlist = {
                new Movie("Inception", 8.8, 148),
                new TVSeries("Stranger Things", 4, 34),
                new Documentary("Planet Earth", "Nature")
        };

        for (Content c : watchlist) {
            c.play();

            if (c instanceof Movie) {
                Movie m = (Movie) c;
                m.displayInfo();
                m.showSubtitles();
            } else if (c instanceof TVSeries) {
                TVSeries tv = (TVSeries) c;
                tv.displayInfo();
                tv.nextEpisodeSuggestion();
            } else if (c instanceof Documentary) {
                Documentary doc = (Documentary) c;
                doc.displayInfo();
                doc.relatedContent();
            }


            c.stop();
            System.out.println();
        }
    }
}

