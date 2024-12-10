package X;

/* renamed from: X.CVz  reason: case insensitive filesystem */
public final class C25067CVz {
    public final AnonymousClass11E A00;
    public final AnonymousClass1SL A01;

    public final C24341Bzc A00() {
        AnonymousClass1LR r0;
        C59732mn A05 = this.A00.A05();
        if (!(A05 == null || (r0 = A05.A01) == null)) {
            int A002 = AnonymousClass1SL.A00(r0);
            if (A002 == 0 || A002 == 1) {
                return C24341Bzc.MOBILE;
            }
            if (A002 == 2) {
                return C24341Bzc.NETWORK_4G;
            }
            if (A002 == 3) {
                return C24341Bzc.NETWORK_5G;
            }
            if (A002 == 4) {
                return C24341Bzc.WIFI;
            }
        }
        return C24341Bzc.UNKNOWN;
    }

    public C25067CVz(AnonymousClass11E r1, AnonymousClass1SL r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
