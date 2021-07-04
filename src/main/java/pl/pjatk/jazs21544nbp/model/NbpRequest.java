package pl.pjatk.jazs21544nbp.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.util.Date;

public class NbpRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id of object", required = true, value = "id", example = "1")
    private Long id;
    @ApiModelProperty(notes = "Starting Date for api", required = true, value = "startDate", example = "2021-01-01")
    private Date startDate;
    @ApiModelProperty(notes = "End Date for api", required = true, value = "endDate", example = "2021-04-01")
    private Date endDate;
    @ApiModelProperty(notes = "Eenum type for gold", required = true, value = "gold", example = "GOLD")
    private Gold gold;
    @ApiModelProperty(notes = "Rate for api", required = true, value = "rate", example = "4")
    private int rate;
    @ApiModelProperty(notes = "When api was called", required = true, value = "dateRequest", example = "2021-04-01")
    private Timestamp dateRequest;


    public NbpRequest(Date startDate, Date endDate, Gold gold, int rate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.gold = gold;
        this.rate = rate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }





}
