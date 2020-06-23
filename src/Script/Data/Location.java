package Script.Data;

import org.rspeer.runetek.api.movement.position.Area;

public enum Location {
    LUMBRIDGE_CHICKEN_PEN(Area.rectangular(3228, 3300, 3231, 3295), Enemy.CHICKEN),
    LUMBRIDGE_SWAMP(Area.rectangular(3213, 3184, 3217, 3176), Enemy.GIANT_RAT, Enemy.GIANT_FROG),
    AL_KHARID_PALACE(Area.rectangular(3287, 3170, 3298, 3167), Enemy.AL_KHARID_WARRIOR),
    EDGEVILLE_DUNGEON(Area.rectangular(3113, 3453, 3117, 3450), Enemy.HILL_GIANT)
    ;

    private Area trainingArea;
    private Enemy[] enemies;

    Location(Area trainingArea, Enemy... enemies) {
        this.trainingArea = trainingArea;
        this.enemies = enemies;
    }

    public Area getTrainingArea() {
        return trainingArea;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }
}
