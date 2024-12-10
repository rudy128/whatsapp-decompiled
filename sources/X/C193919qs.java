package X;

/* renamed from: X.9qs  reason: invalid class name and case insensitive filesystem */
public final class C193919qs {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public String A00(String str) {
        C18070vi.A0d(str, 0);
        return ((C58832lK) this.A01.get()).A00(AnonymousClass000.A0y("_data", AnonymousClass000.A11(str)));
    }

    public boolean A02(String str, long j) {
        Long A0m;
        AnonymousClass00H r5 = this.A01;
        String A002 = ((C58832lK) r5.get()).A00(AnonymousClass000.A0y("_timestamp", AnonymousClass000.A11(str)));
        if (!(A002 == null || (A0m = C108965cb.A0m(A002)) == null)) {
            long longValue = A0m.longValue();
            if (longValue == -1 || this.A00.A05() - longValue <= j) {
                return true;
            }
        }
        ((C58832lK) r5.get()).A01(AnonymousClass000.A0y("_timestamp", AnonymousClass000.A11(str)));
        ((C58832lK) r5.get()).A01(AnonymousClass000.A0y("_data", AnonymousClass000.A11(str)));
        return false;
    }

    public C193919qs(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A01(String str, String str2) {
        C18070vi.A0h(str, str2);
        long A05 = this.A00.A05();
        AnonymousClass00H r3 = this.A01;
        ((C58832lK) r3.get()).A02(AnonymousClass000.A0y("_timestamp", AnonymousClass000.A11(str)), String.valueOf(A05));
        ((C58832lK) r3.get()).A02(AnonymousClass000.A0y("_data", AnonymousClass000.A11(str)), str2);
    }
}
