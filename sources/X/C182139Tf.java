package X;

/* renamed from: X.9Tf  reason: invalid class name and case insensitive filesystem */
public abstract class C182139Tf {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        A0e.append(AnonymousClass1EG.A08(", ", "account_id", "account_type", "account_display_name", "account_fan_count", "account_has_media_post"));
        A0e.append(" FROM ");
        C17890vO.A18(A0e, "wa_biz_profiles_linked_accounts_table");
        A0e.append("wa_biz_profile_id");
        A00 = AnonymousClass000.A0y(" = ?", A0e);
    }
}
