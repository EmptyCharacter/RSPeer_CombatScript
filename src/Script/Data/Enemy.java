package Script.Data;

public enum Enemy {
    CHICKEN("Chicken", 1),
    GIANT_RAT("Giant rat", 10),
    GIANT_FROG("Giant frog", 10),
    AL_KHARID_WARRIOR("Al-Kharid warrior", 25),
    HILL_GIANT("Hill Giant", 40)
    ;


    private String enemyName;
    private int reqLevel;

    Enemy(String enemyName, int reqLevel) {
        this.enemyName = enemyName;
        this.reqLevel = reqLevel;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getReqLevel() {
        return reqLevel;
    }
}
