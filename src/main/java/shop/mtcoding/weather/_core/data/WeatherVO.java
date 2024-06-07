package shop.mtcoding.weather._core.data;

public class WeatherVO {
    public String uri = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst";
    public String serviceKey = "L1sSH1CqRaq2%2BfsHT%2FpI6x%2BLRXGeQV8iR0%2FSTberGznMx%2FEeG1TvLKSskOBhA2oB%2BQhwAchToYDpZvDGewh%2F1A%3D%3D";
    public String baseDate;
    public String baseTime;
    public String nx;
    public String ny;

    public WeatherVO(String baseDate, String baseTime, String nx, String ny) {
        this.baseDate = baseDate;
        this.baseTime = baseTime;
        this.nx = nx;
        this.ny = ny;
    }
}