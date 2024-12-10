package X;

/* renamed from: X.2Vj  reason: invalid class name and case insensitive filesystem */
public abstract class C50682Vj {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        C43501zu.A01(A0e, C50692Vk.A00);
        C17890vO.A18(A0e, "location_sharer");
        A0e.append("from_me = ? AND expires >= ?");
        A0e.append(" ORDER BY ");
        A00 = AnonymousClass000.A0y("_id DESC", A0e);
    }
}
