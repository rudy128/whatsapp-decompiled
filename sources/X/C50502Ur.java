package X;

/* renamed from: X.2Ur  reason: invalid class name and case insensitive filesystem */
public abstract class C50502Ur {
    public static final String A00(AnonymousClass77K r2) {
        int i = r2.A00;
        if (i == 0) {
            return "all_contacts";
        }
        if (i == 1) {
            return "only_with";
        }
        if (i != 2) {
            return null;
        }
        if (r2.A02.isEmpty()) {
            return "except_empty_denylist";
        }
        return "except";
    }
}
