package X;

import java.io.File;

/* renamed from: X.1Ro  reason: invalid class name and case insensitive filesystem */
public final class C26291Ro {
    public final AnonymousClass1Cd A00;

    public C26291Ro(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Long A00() {
        AnonymousClass1Cd r2 = this.A00;
        r2.A06();
        File file = r2.A03;
        if (!file.exists()) {
            return null;
        }
        r2.A06();
        return Long.valueOf(file.length());
    }
}
