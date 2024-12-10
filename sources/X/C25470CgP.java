package X;

import android.util.Base64;

/* renamed from: X.CgP  reason: case insensitive filesystem */
public final class C25470CgP {
    public static final C26123Csl A00;
    public static final C26123Csl A01;
    public static final C26123Csl A02;
    public static final C26123Csl A03;
    public static final C26123Csl A04;
    public static final C26123Csl A05;
    public static final C26123Csl A06;
    public static final C26123Csl A07;
    public static final C26123Csl A08;
    public static final C26123Csl A09;
    public static final C26123Csl A0A;
    public static final C26123Csl A0B;
    public static final C26123Csl A0C;

    static {
        C25559Chx chx = new C25559Chx(C25400Cf2.A00());
        if ("".isEmpty()) {
            C25559Chx chx2 = new C25559Chx(true, new C25559Chx(chx.A02, chx.A00).A00);
            Double A0Q = AnonymousClass8BV.A0Q();
            A00 = new C26123Csl(chx2, A0Q, "getTokenRefactor__account_data_service_sample_percentage");
            Boolean A0i = AnonymousClass000.A0i();
            A01 = new C26123Csl(chx2, A0i, "getTokenRefactor__account_data_service_tokenAPI_usable");
            A02 = new C26123Csl(chx2, 20L, "getTokenRefactor__account_manager_timeout_seconds");
            A03 = new C26123Csl(chx2, C17890vO.A0L(), "getTokenRefactor__android_id_shift");
            try {
                A04 = new C23263BeD(chx2, C25401Cf3.A00, C23273BeN.A01(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
                A05 = new C26123Csl(chx2, A0i, "getTokenRefactor__chimera_get_token_evolved");
                A06 = new C26123Csl(chx2, 20L, "getTokenRefactor__clear_token_timeout_seconds");
                A07 = new C26123Csl(chx2, 20L, "getTokenRefactor__default_task_timeout_seconds");
                Boolean A0h = AnonymousClass000.A0h();
                A08 = new C26123Csl(chx2, A0h, "getTokenRefactor__gaul_accounts_api_evolved");
                A09 = new C26123Csl(chx2, A0h, "getTokenRefactor__gaul_token_api_evolved");
                A0A = new C26123Csl(chx2, 120L, "getTokenRefactor__get_token_timeout_seconds");
                A0B = new C26123Csl(chx2, A0i, "getTokenRefactor__gms_account_authenticator_evolved");
                A0C = new C26123Csl(chx2, A0Q, "getTokenRefactor__gms_account_authenticator_sample_percentage");
            } catch (Exception e) {
                throw AnonymousClass8BR.A0v(e);
            }
        } else {
            throw AnonymousClass000.A0n("Cannot set GServices prefix and skip GServices");
        }
    }
}
