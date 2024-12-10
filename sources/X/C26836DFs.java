package X;

/* renamed from: X.DFs  reason: case insensitive filesystem */
public final class C26836DFs implements C17780vD {
    public final C22821Di A00;

    public /* synthetic */ boolean Beg(C17780vD r2) {
        C18070vi.A0d(r2, 1);
        return C25322CdT.A01(this, r2);
    }

    public C03270Hh BhN(AnonymousClass0HJ r10, long j) {
        long A002;
        int i = 0;
        int i2 = 0;
        C04660Og A003 = C02750Ff.A00(AnonymousClass8BR.A02(j));
        int A02 = A003.A02(j);
        if (A02 != Integer.MAX_VALUE) {
            i = A02;
        } else {
            C04660Og A004 = C02750Ff.A00((int) j);
            if (A004.A01(j) == Integer.MAX_VALUE) {
                A002 = C02760Fg.A00(Math.max(A003.A04(j), 0), Math.max(A004.A03(j), 0));
                return new C03270Hh(this.A00.invoke(new C25763ClY(C24564C9l.A00((float) ((int) ((A002 >> 32) & 4294967295L)), (float) ((int) (A002 & 4294967295L))))), A002);
            }
        }
        int A01 = C02750Ff.A00((int) j).A01(j);
        if (A01 != Integer.MAX_VALUE) {
            i2 = A01;
        }
        A002 = C02760Fg.A00(i, i2);
        return new C03270Hh(this.A00.invoke(new C25763ClY(C24564C9l.A00((float) ((int) ((A002 >> 32) & 4294967295L)), (float) ((int) (A002 & 4294967295L))))), A002);
    }

    public C26836DFs(C22821Di r1) {
        this.A00 = r1;
    }
}
