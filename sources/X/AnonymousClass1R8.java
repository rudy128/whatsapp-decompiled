package X;

import android.app.PendingIntent;

/* renamed from: X.1R8  reason: invalid class name */
public final class AnonymousClass1R8 {
    public final AnonymousClass1R9 A00;

    public AnonymousClass1R8(AnonymousClass11C r2) {
        AnonymousClass1R9 r0;
        C18070vi.A0d(r2, 1);
        if (AnonymousClass112.A08()) {
            r0 = new AnonymousClass2DM(r2);
        } else if (AnonymousClass112.A01()) {
            r0 = new AnonymousClass1RA(r2);
        } else {
            r0 = new AnonymousClass1R9(r2);
        }
        this.A00 = r0;
    }

    public final boolean A00(PendingIntent pendingIntent, int i, long j) {
        return this.A00.A02(pendingIntent, i, j, false);
    }
}
