package X;

/* renamed from: X.CgD  reason: case insensitive filesystem */
public final class C25460CgD {
    public static final C26123Csl A00;
    public static final C26123Csl A01;
    public static final C26123Csl A02;
    public static final C26123Csl A03;
    public static final C26123Csl A04;

    static {
        C25559Chx chx = new C25559Chx(C25400Cf2.A00());
        if ("".isEmpty()) {
            C25559Chx chx2 = new C25559Chx(true, new C25559Chx(chx.A02, chx.A00).A00);
            Boolean A0h = AnonymousClass000.A0h();
            A00 = new C26123Csl(chx2, A0h, "Aang__create_auth_exception_with_pending_intent");
            A01 = new C26123Csl(chx2, A0h, "Aang__enable_add_account_restrictions");
            A02 = new C26123Csl(chx2, true, "Aang__log_missing_gaia_id_event");
            A03 = new C26123Csl(chx2, true, "Aang__log_obfuscated_gaiaid_status");
            A04 = new C26123Csl(chx2, A0h, "Aang__switch_clear_token_to_aang");
            return;
        }
        throw AnonymousClass000.A0n("Cannot set GServices prefix and skip GServices");
    }
}
