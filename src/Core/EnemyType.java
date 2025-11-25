package Core;


public enum EnemyType {
    DUWENDE("Duwende", 5, 12, "throws a tiny rock"),
    TIYANAK("Tiyanak", 6, 13, "bites viciously"),
    BUNGISNGIS("Bungisngis", 10, 20, "swings a large tree branch"),
    BUNGISNGIS2("Bungisngis", 8, 17, "swings arm at you"),
    ASWANG("Aswang", 8, 15, "slashes with claws"),
    SIGBIN("Sigbin", 6, 13, "lunges with shadow fangs"),
    TIKTIK("Tiktik", 7, 14, "whips their tongue at you"),
    ABWAK("Abwak", 6, 13, "lunges with claws"),
    BABAYLANS("Babaylans", 12, 16, "casts a curse on you"),
    BABAYLANS2("Babaylan Sentinels", 13, 17, "casts a curse on you"),
    HUMANS("Humans", 10, 15, "fires their gun");
    //insert tria and erika bosses

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
