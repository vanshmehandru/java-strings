package week7.assignmentproblems;

class Course {
    String title;
    String instructor;
    String enrollmentDate;

    Course(String title, String instructor, String enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    void showProgress() {
        System.out.println("Course: " + title + ", Instructor: " + instructor + ", Enrolled: " + enrollmentDate);
    }
}

class VideoCourse extends Course {
    int completionPercentage;
    int watchTime;

    VideoCourse(String title, String instructor, String enrollmentDate, int completionPercentage, int watchTime) {
        super(title, instructor, enrollmentDate);
        this.completionPercentage = completionPercentage;
        this.watchTime = watchTime;
    }

    @Override
    void showProgress() {
        super.showProgress();
        System.out.println("Completion: " + completionPercentage + "%, Watch Time: " + watchTime + " mins");
    }
}

class InteractiveCourse extends Course {
    int quizScore;
    int projectsCompleted;

    InteractiveCourse(String title, String instructor, String enrollmentDate, int quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    void showProgress() {
        super.showProgress();
        System.out.println("Quiz Score: " + quizScore + ", Projects Completed: " + projectsCompleted);
    }
}

class ReadingCourse extends Course {
    int pagesRead;
    int notesTaken;

    ReadingCourse(String title, String instructor, String enrollmentDate, int pagesRead, int notesTaken) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead;
        this.notesTaken = notesTaken;
    }

    @Override
    void showProgress() {
        super.showProgress();
        System.out.println("Pages Read: " + pagesRead + ", Notes Taken: " + notesTaken);
    }
}

class CertificationCourse extends Course {
    int examAttempts;
    boolean certified;

    CertificationCourse(String title, String instructor, String enrollmentDate, int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts;
        this.certified = certified;
    }

    @Override
    void showProgress() {
        super.showProgress();
        System.out.println("Exam Attempts: " + examAttempts + ", Certification Status: " + (certified ? "Certified" : "Not Certified"));
    }
}

public class OnlineLearning {
    public static void main(String[] args) {
        Course[] courses = {
                new VideoCourse("Java Basics", "Alice", "2025-09-30", 75, 120),
                new InteractiveCourse("Python Projects", "Bob", "2025-09-28", 85, 3),
                new ReadingCourse("Algorithms Book", "Charlie", "2025-09-25", 200, 15),
                new CertificationCourse("AWS Certification", "Diana", "2025-09-20", 2, true)
        };

        for (Course c : courses) {
            c.showProgress();
            System.out.println();
        }
    }
}

