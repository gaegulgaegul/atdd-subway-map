package nextstep.subway.applicaion.dto;

public class StationLineModifyRequest {
    private String name;
    private String color;

    public StationLineModifyRequest(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
