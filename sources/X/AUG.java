package X;

public final class AUG implements B5E {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AUG) && this.A00 == ((AUG) obj).A00);
    }

    public int hashCode() {
        Integer num = this.A00;
        return C72453Mb.A0E(num, A00(num));
    }

    public AUG(Integer num) {
        this.A00 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "GROUP_NOT_FOUND";
            case 2:
                return "GROUP_SUSPENDED";
            case 3:
                return "RATE_OVER_LIMIT";
            case 4:
                return "INTERNAL_SERVER_ERROR";
            case 5:
                return "DEFAULT";
            default:
                return "USER_NOT_ADMIN";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupError(groupLevelError=");
        return C17900vP.A0B(A00(this.A00), A10);
    }
}
