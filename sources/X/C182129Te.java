package X;

/* renamed from: X.9Te  reason: invalid class name and case insensitive filesystem */
public abstract class C182129Te {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "category_id";
        A1Z[1] = "category_name";
        A0e.append(AnonymousClass1EG.A08(", ", A1Z));
        A0e.append(" FROM ");
        C17890vO.A18(A0e, "wa_biz_profiles_categories");
        A0e.append("wa_biz_profile_id");
        A0e.append(" = ? ORDER BY ");
        A0e.append("_id");
        A00 = AnonymousClass000.A0y(" ASC", A0e);
    }
}
