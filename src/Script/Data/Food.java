package Script.Data;

public enum Food {
    TROUT("Trout"),
    SALMON("Salmon"),
    TUNA("Tuna"),
    LOBSTER("Lobster"),
    SWORDFISH("Swordfish")
    ;

    private String foodName;

    Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }
}
