package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsDto {

    private Long count;

    private Double sum;

    private Double avg;

    private Double min;

    private Double max;


    public StatisticsDto(DoubleSummaryStatistics statistics) {
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.max = Math.max(0, statistics.getMax());
        this.min = Math.min(0, statistics.getMin());
    }

    public Double getAvg() {
        return avg;
    }

    public Long getCount() {
        return count;
    }

    public Double getMax() {
        return max;
    }

    public Double getMin() {
        return min;
    }

    public Double getSum() {
        return sum;
    }
}
