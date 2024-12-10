package X;

/* renamed from: X.6lx  reason: invalid class name and case insensitive filesystem */
public final class C131966lx {
    public final AnonymousClass19T A00;
    public final AnonymousClass11E A01;

    public final String A00() {
        int A002 = AnonymousClass1SL.A00(this.A01.A04());
        if (A002 == 0) {
            return "2G";
        }
        if (A002 == 1) {
            return "3G";
        }
        if (A002 == 2) {
            return "4G";
        }
        if (A002 == 3) {
            return "5G";
        }
        if (A002 != 4) {
            return "UNKNOWN";
        }
        return "WIFI";
    }

    public C131966lx(AnonymousClass11E r1, AnonymousClass19T r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
