package com.example.passweb.service.statistics;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChartData {
    private List<String> labels;
    private List<Long> attendedCounts;
    private List<Long> cancelledCounts;

    public ChartData(List<String> labels, List<Long> attendedCounts, List<Long> cancelledCounts) {
        this.labels = labels;
        this.attendedCounts = attendedCounts;
        this.cancelledCounts = cancelledCounts;

    }

}
