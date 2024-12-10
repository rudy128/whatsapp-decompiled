package X;

public abstract class CCG {
    public static final Boolean A00(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(C17890vO.A1R(AnonymousClass000.A0M(obj)));
        }
        C25913CoX.A01("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
        return null;
    }
}
