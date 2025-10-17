public class VotingSystem {
    public void processVote(String voterId, String candidate) {
        class VoteValidator {
            boolean validate() {
                return voterId != null && voterId.startsWith("V");
            }
        }
        VoteValidator v = new VoteValidator();
        if (v.validate()) System.out.println("Vote recorded for " + candidate);
        else System.out.println("Invalid voter ID");
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.processVote("V123", "Amit");
        vs.processVote("123", "Ravi");
    }
}
