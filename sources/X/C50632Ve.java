package X;

/* renamed from: X.2Ve  reason: invalid class name and case insensitive filesystem */
public abstract class C50632Ve {
    public static final String A00;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("   SELECT ");
        A10.append(C209514c.A00);
        A10.append(" FROM ");
        C17890vO.A18(A10, "available_message_view");
        A10.append("_id > ? ");
        A10.append(" ORDER BY ");
        A10.append("_id ASC");
        A00 = AnonymousClass000.A0y(" LIMIT ?", A10);
    }
}
