package X;

/* renamed from: X.9Th  reason: invalid class name and case insensitive filesystem */
public abstract class C182159Th {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        A0e.append(AnonymousClass1EG.A08(", ", "area_description", "radius", "center_latitude", "center_longitude"));
        A0e.append(" FROM ");
        C17890vO.A18(A0e, "wa_biz_profiles_service_areas");
        A0e.append("wa_biz_profile_id");
        A00 = AnonymousClass000.A0y(" = ?", A0e);
    }
}
