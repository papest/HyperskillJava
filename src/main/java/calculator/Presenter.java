package calculator;

public class Presenter {
    private final Calculator calculator;

    private Integer recentValue;

    public Presenter(Calculator calculator) {
        this.calculator = calculator;
    }

    public void showSum(int a, int b) {
        int sum = calculator.sum(a, b);
        recentValue = sum;
        System.out.println(sum);
    }

    public Integer getRecentValue() {
        return recentValue;
    }
}