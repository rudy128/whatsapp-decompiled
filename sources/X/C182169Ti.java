package X;

/* renamed from: X.9Ti  reason: invalid class name and case insensitive filesystem */
public abstract class C182169Ti {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        AnonymousClass1H2.A02("wa_biz_profile_to_service_offerings", A0e, new String[]{"wa_biz_category_service_offerings_id", "wa_biz_profile_id", "is_offered"});
        A0e.append(",");
        AnonymousClass1H2.A02("wa_biz_category_service_offerings", A0e, new String[]{"_id", "category_id", "category_name", "offering_name"});
        A0e.append(" FROM ");
        A0e.append("wa_biz_profile_to_service_offerings");
        A0e.append(" INNER JOIN ");
        A0e.append("wa_biz_category_service_offerings");
        A0e.append(" ON ");
        A0e.append("wa_biz_profile_to_service_offerings.wa_biz_profile_id");
        A0e.append(" = ? AND ");
        A0e.append("wa_biz_category_service_offerings._id");
        A0e.append(" = ");
        A00 = AnonymousClass000.A0y("wa_biz_profile_to_service_offerings.wa_biz_category_service_offerings_id", A0e);
    }
}
