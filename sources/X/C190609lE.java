package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9lE  reason: invalid class name and case insensitive filesystem */
public final class C190609lE {
    public final AnonymousClass11P A00;
    public final AnonymousClass1TM A01;
    public final AnonymousClass1HY A02;

    public final long A00() {
        long A05 = AnonymousClass8BR.A05(this.A01.A01, 3302);
        if (A05 <= -1) {
            return 0;
        }
        return new Date().getTime() - TimeUnit.MILLISECONDS.convert(A05, TimeUnit.DAYS);
    }

    public C190609lE(AnonymousClass11P r1, AnonymousClass1TM r2, AnonymousClass1HY r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
