package X;

/* renamed from: X.2sl  reason: invalid class name and case insensitive filesystem */
public final class C63252sl {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11N A02;
    public final AnonymousClass00H A03;

    public static final void A01(C63252sl r2, Runnable runnable) {
        if (C18020vd.A05(C18040vf.A02, ((C52532b4) r2.A01.get()).A00, 2003)) {
            runnable.run();
        }
    }

    public final int A02(int i) {
        if (!C18020vd.A05(C18040vf.A02, ((C52532b4) this.A01.get()).A00, 2003)) {
            return -1;
        }
        C54432e8 r2 = (C54432e8) this.A00.get();
        int andIncrement = r2.A02.getAndIncrement();
        r2.A00.markerStart(i, andIncrement);
        return andIncrement;
    }

    public final void A03(C55062f9 r7, int i, int i2) {
        A01(this, new C70823Cq(r7, this, i, i2, 15));
    }

    public final void A04(C55062f9 r7, int i, int i2) {
        A01(this, new C70823Cq(r7, this, i, i2, 16));
    }

    public C63252sl(AnonymousClass11N r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r4, r1);
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r1;
    }

    public static final void A00(C55062f9 r11, C63252sl r12, int i, int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis();
        C55842gS r3 = (C55842gS) r12.A03.get();
        r3.A02.CGF(new AnonymousClass3C5(r11, r3, new C55462fo(r12, i3, i, i2, currentTimeMillis), 12));
    }
}
