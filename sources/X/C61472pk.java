package X;

import java.util.UUID;

/* renamed from: X.2pk  reason: invalid class name and case insensitive filesystem */
public final class C61472pk {
    public UUID A00;
    public boolean A01 = true;
    public final AnonymousClass18K A02;

    public C61472pk(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public static final AnonymousClass2G9 A00(C61472pk r2) {
        String str;
        AnonymousClass2G9 r1 = new AnonymousClass2G9();
        UUID uuid = r2.A00;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        r1.A05 = str;
        return r1;
    }
}
