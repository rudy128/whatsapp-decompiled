package X;

/* renamed from: X.39k  reason: invalid class name and case insensitive filesystem */
public final class C700139k implements AnonymousClass3LK {
    public final AnonymousClass00H A00;

    public C700139k(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCb(AnonymousClass206 r5, C49702Rn r6, int i) {
        boolean z;
        C20952Ac6 A002;
        C693536w r3;
        C18070vi.A0d(r5, 0);
        C693536w A003 = C60502o8.A00(r5);
        if (A003 == null || A003.A08 != null) {
            z = false;
        } else {
            ((C32641hW) this.A00.get()).A01(A003, r5.A0x);
            z = true;
        }
        if ((r5 instanceof AnonymousClass210) && (A002 = C196869vm.A00((AnonymousClass210) r5)) != null && (r3 = A002.A00) != null && r3.A08 == null) {
            ((C32641hW) this.A00.get()).A01(r3, r5.A0x);
        } else if (!z) {
            return;
        }
        if (r6 != null) {
            throw C17900vP.A07(C700139k.class);
        }
    }
}
