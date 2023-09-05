package map;

public class vote {

    private String candidate;
    private Integer number_of_votes;
    
    public vote(String candidate, Integer number_of_votes) {
        this.candidate = candidate;
        this.number_of_votes = number_of_votes;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Integer getNumber_of_votes() {
        return number_of_votes;
    }

    public void setNumber_of_votes(Integer number_of_votes) {
        this.number_of_votes = number_of_votes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
        result = prime * result + ((number_of_votes == null) ? 0 : number_of_votes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        vote other = (vote) obj;
        if (candidate == null) {
            if (other.candidate != null)
                return false;
        } else if (!candidate.equals(other.candidate))
            return false;
        if (number_of_votes == null) {
            if (other.number_of_votes != null)
                return false;
        } else if (!number_of_votes.equals(other.number_of_votes))
            return false;
        return true;
    }

    
    
}
