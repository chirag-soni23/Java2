package Challenge17.Candidate;

public class TestingPrime {
       public static void main(String[] args) {
              Candidate candidate = num ->{
                     if(num % 2 == 0){
                            return false;
                     }
                     return true;
              };
              System.out.println(candidate.isCandidate(7));
       }
}
