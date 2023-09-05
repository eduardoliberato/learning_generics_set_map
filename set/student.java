package set;

public class student {
    
    
    private Integer number_code;

    public student(Integer number_code) {
        this.number_code = number_code;
    }

    public Integer getNumber_code() {
        return number_code;
    }

    public void setNumber_code(Integer number_code) {
        this.number_code = number_code;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number_code == null) ? 0 : number_code.hashCode());
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
        student other = (student) obj;
        if (number_code == null) {
            if (other.number_code != null)
                return false;
        } else if (!number_code.equals(other.number_code))
            return false;
        return true;
    }

    
}
