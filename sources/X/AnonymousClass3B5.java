package X;

import android.text.TextUtils;

/* renamed from: X.3B5  reason: invalid class name */
public final class AnonymousClass3B5 implements C22486B9s {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;

    public boolean BCL(C186309dz r13, C22484B9q b9q, AnonymousClass5YR r15) {
        C18070vi.A0d(r13, 1);
        AnonymousClass00H r10 = this.A01.A00;
        if (C17880vN.A0B(r10).getLong("inorganic_notification_last_timestamp", 0) != 0) {
            String A0s = C17880vN.A0s("param", r13.A01);
            if (!(A0s == null || A0s.length() == 0 || !TextUtils.isDigitsOnly(A0s))) {
                if (AnonymousClass11P.A01(this.A00) - C17880vN.A0B(r10).getLong("inorganic_notification_last_timestamp", 0) > Long.parseLong(A0s) * 60000) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass3B5(AnonymousClass11P r1, C19830z4 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
