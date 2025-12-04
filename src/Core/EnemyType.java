package Core;


public enum EnemyType {
    DUWENDE("Duwende", 6, 15, "throws a tiny rock"),
    TIYANAK("Tiyanak", 7, 16, "bites viciously"),
    BUNGISNGIS("Bungisngis", 12, 32, "swings a large tree branch"),
    BUNGISNGIS2("Bungisngis", 8, 29, "swings arm at you"),
    ASWANG("Aswang", 9, 20, "slashes with claws"),
    SIGBIN("Sigbin", 7, 22, "lunges with shadow fangs"),
    TIKTIK("Tiktik", 8, 22, "whips their tongue at you"),
    ABWAK("Abwak", 7, 22, "lunges with claws"),
    BABAYLANS("Babaylans", 13, 25, "casts a curse on you"),
    BABAYLANS2("Babaylan Sentinels", 13, 30, "casts a curse on you"),
    HUMANS("Humans", 10, 67, "fires their gun"),
    TRIA("Tria", 20, 50, "throws knives on you"),
    ERIKA("Erika", 20, 40, "lunges at you"),
    ERIKA2("Erika Clones", 15, 20, "scratches you");


    public final String typeName;
    public final int minDamage;
    public final int maxDamage;
    public final String attackDescription;

    EnemyType(String typeName, int minDamage, int maxDamage, String attackDescription) {
        this.typeName = typeName;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackDescription = attackDescription;
    }
}
