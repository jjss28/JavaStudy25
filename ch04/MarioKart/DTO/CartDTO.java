package ch04.MarioKart.DTO;

public class CartDTO {
    public static String COLOR_BLUE = "BLUE";
    public static String COLOR_GREEN = "GREEN";
    public static String COLOR_YELLOW = "YELLOW";
    public static String COLOR_BLACK = "BLACK";
    public static String COLOR_WHITE = "WHITE";

    // 사용할 수 있는 카트 종류 목록 (상수)
    public static String TYPE_STANDARD = "STANDARD";
    public static String TYPE_SPEED = "SPEED";
    public static String TYPE_TANK = "TANK";

    // 실제 필드
    private String color;
    private String type;

    // 생성자
    public CartDTO(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
}