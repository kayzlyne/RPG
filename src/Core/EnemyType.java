package Core;


public enum EnemyType {
    DUWENDE("Duwende", 5, 10, "throws a tiny rock"),
    TIYANAK("Tiyanak", 10, 15, "bites viciously"),
    BUNGISNGIS("Bungisngis", 10, 20, "swings a large tree branch"),
    ASWANG("Aswang", 8, 15, "slashes with claws"),
    SIGBIN("Sigbin", 6, 12, "lunges with shadow fangs"),
    TIKTIK("Tiktik", 7, 15, "whips their tongue at you"),
    ABWAK("Abwak", 6, 12, "lunges with claws"),
    BABAYLANS("Babaylans", 12, 16, "casts a curse on you"),
    HUMANS("Humans", 10, 15, "fires their gun");

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
