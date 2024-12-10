package X;

/* renamed from: X.0Wm  reason: invalid class name and case insensitive filesystem */
public final class C05980Wm implements C16910tQ {
    public final C01880Ag A00;

    private final long A00() {
        C01880Ag r1 = this.A00;
        C01880Ag A01 = A01(r1);
        C05980Wm A0n = A01.A0n();
        long j = AnonymousClass0QY.A03;
        return AnonymousClass0QY.A04(Bht(A0n, j), r1.A0r().Bht(A01.A0r(), j));
    }

    public final C01850Ad A02() {
        return this.A00.A0r();
    }

    public long BZM() {
        C01880Ag r0 = this.A00;
        return C25293Ccv.A00(r0.A01, r0.A00);
    }

    public boolean Be8() {
        return this.A00.A0r().Be8();
    }

    public AnonymousClass0NU Bhs(C16910tQ r2, boolean z) {
        return this.A00.A0r().Bhs(r2, z);
    }

    public long Bht(C16910tQ r16, long j) {
        C16910tQ r6 = r16;
        long j2 = j;
        if (r6 instanceof C05980Wm) {
            C01880Ag r2 = ((C05980Wm) r6).A00;
            C01850Ad A0r = r2.A0r();
            A0r.A12();
            C01880Ag r8 = this.A00;
            C01880Ag A0v = r8.A0r().A0y(A0r).A0v();
            if (A0v != null) {
                long A0m = r2.A0m(A0v);
                long A002 = C7A.A00(C22339B3q.A01(AnonymousClass0QY.A01(j2)), C22339B3q.A01(AnonymousClass0QY.A02(j2)));
                long A003 = C7A.A00(((int) (A0m >> 32)) + ((int) (A002 >> 32)), ((int) (A0m & 4294967295L)) + ((int) (A002 & 4294967295L)));
                long A0m2 = r8.A0m(A0v);
                long A004 = C7A.A00(((int) (A003 >> 32)) - ((int) (A0m2 >> 32)), ((int) (A003 & 4294967295L)) - ((int) (A0m2 & 4294967295L)));
                return AnonymousClass001.A0p((float) ((int) (A004 >> 32)), (float) ((int) (A004 & 4294967295L)));
            }
            C01880Ag A01 = A01(r2);
            long A0m3 = r2.A0m(A01);
            long A0b = A01.A0b();
            long A005 = C7A.A00(((int) (A0m3 >> 32)) + ((int) (A0b >> 32)), ((int) (A0m3 & 4294967295L)) + ((int) (A0b & 4294967295L)));
            long A006 = C7A.A00(C22339B3q.A01(AnonymousClass0QY.A01(j2)), C22339B3q.A01(AnonymousClass0QY.A02(j2)));
            long A007 = C7A.A00(((int) (A005 >> 32)) + ((int) (A006 >> 32)), ((int) (A005 & 4294967295L)) + ((int) (A006 & 4294967295L)));
            long A0m4 = r8.A0m(A01(r8));
            long A0b2 = A01(r8).A0b();
            long A008 = C7A.A00(((int) (A0m4 >> 32)) + ((int) (A0b2 >> 32)), ((int) (A0m4 & 4294967295L)) + ((int) (A0b2 & 4294967295L)));
            long A009 = C7A.A00(((int) (A007 >> 32)) - ((int) (A008 >> 32)), ((int) (A007 & 4294967295L)) - ((int) (A008 & 4294967295L)));
            C01850Ad A0x = A01(r8).A0r().A0x();
            C18070vi.A0b(A0x);
            C01850Ad A0x2 = A01.A0r().A0x();
            C18070vi.A0b(A0x2);
            return A0x.Bht(A0x2, AnonymousClass001.A0p((float) ((int) (A009 >> 32)), (float) ((int) (A009 & 4294967295L))));
        }
        C01880Ag A012 = A01(this.A00);
        return AnonymousClass0QY.A05(Bht(A012.A0o(), j2), A012.A0r().Bht(r6, AnonymousClass0QY.A03));
    }

    public long Bhu(long j) {
        return this.A00.A0r().Bhu(AnonymousClass0QY.A05(j, A00()));
    }

    public long Bhw(long j) {
        return this.A00.A0r().Bhw(AnonymousClass0QY.A05(j, A00()));
    }

    public void CPm(C16910tQ r2, float[] fArr) {
        this.A00.A0r().CPm(r2, fArr);
    }

    public long CSD(long j) {
        return AnonymousClass0QY.A05(this.A00.A0r().CSD(j), A00());
    }

    public C05980Wm(C01880Ag r1) {
        this.A00 = r1;
    }

    public static final C01880Ag A01(C01880Ag r2) {
        AnonymousClass0XV A0p = r2.A0p();
        while (true) {
            AnonymousClass0XV A0I = A0p.A0I();
            AnonymousClass0XV r1 = null;
            if (A0I == null || A0I.A07 == null) {
                C01880Ag A0v = A0p.A0K().A0v();
                C18070vi.A0b(A0v);
            } else {
                AnonymousClass0XV A0I2 = A0p.A0I();
                if (A0I2 != null) {
                    r1 = A0I2.A07;
                }
                C18070vi.A0b(r1);
                AnonymousClass0XV A0I3 = A0p.A0I();
                C18070vi.A0b(A0I3);
                A0p = A0I3.A07;
                C18070vi.A0b(A0p);
            }
        }
        C01880Ag A0v2 = A0p.A0K().A0v();
        C18070vi.A0b(A0v2);
        return A0v2;
    }

    public C16910tQ BWE() {
        C01880Ag A0v;
        if (Be8()) {
            C01850Ad A0x = this.A00.A0r().A0t().A0K().A0x();
            if (A0x == null || (A0v = A0x.A0v()) == null) {
                return null;
            }
            return A0v.A0n();
        }
        throw AnonymousClass000.A0n("LayoutCoordinate operations are only valid when isAttached is true");
    }
}
