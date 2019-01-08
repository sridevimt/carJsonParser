import java.io.Serializable;

public class RentalCount implements Serializable{

    private static final long serialVersionUID = 4194909030723288965L;
    private Integer lastweek;
    private Integer yeartodate;

    public Integer getLastweek() {
        return lastweek;
    }

    public void setLastweek(Integer lastweek) {
        this.lastweek = lastweek;
    }

    public Integer getYeartodate() {
        return yeartodate;
    }

    public void setYeartodate(Integer yeartodate) {
        this.yeartodate = yeartodate;
    }


    @Override
    public String toString() {
        return "RentalCount{" +
                "lastweek=" + lastweek +
                ", yeartodate=" + yeartodate +
                '}';
    }
}
