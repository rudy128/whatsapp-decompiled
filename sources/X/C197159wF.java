package X;

import java.util.Map;

/* renamed from: X.9wF  reason: invalid class name and case insensitive filesystem */
public final class C197159wF {
    public static final Map A00;

    static {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
        C72463Mc.A1H("pincode", "^\\d{6}$", r2);
        C108985cd.A1G("cep", "^\\d{8}$", r2);
        C72463Mc.A1I("postal_code", "^\\d{5}$", r2);
        A00 = AnonymousClass1D7.A0B(r2);
    }
}
