package X;

/* renamed from: X.1NW  reason: invalid class name */
public final class AnonymousClass1NW {
    public final AnonymousClass1L7 A00;
    public final C219217x A01;
    public final AnonymousClass19D A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public AnonymousClass1NW(AnonymousClass1L7 r2, C219217x r3, AnonymousClass19D r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r7, 6);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
    }

    public static final boolean A00(AnonymousClass1NW r2) {
        C18020vd r22;
        int i;
        if (((AnonymousClass1CM) r2.A05.get()).A04()) {
            r22 = r2.A03;
            i = 11306;
        } else {
            r22 = r2.A02;
            i = 9904;
        }
        return C18020vd.A05(C18040vf.A02, r22, i);
    }

    public final boolean A01() {
        if (this.A01.A02("android.permission.GET_ACCOUNTS") != 0 || !((C30191dX) this.A04.get()).A00()) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if ((!A00(this) || !this.A00.A0C()) && !this.A01.A08()) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        if ((!A00(this) || !this.A00.A0C()) && !this.A01.A0G()) {
            return false;
        }
        return true;
    }
}
