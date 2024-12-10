package X;

/* renamed from: X.39N  reason: invalid class name */
public final class AnonymousClass39N implements AnonymousClass3ML {
    public final AnonymousClass00H A00;

    public AnonymousClass39N(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r5, C49702Rn r6) {
        boolean z;
        C20952Ac6 A002;
        C18070vi.A0d(r5, 0);
        C693536w A003 = C60502o8.A00(r5);
        if (!r5.A11(2048) || A003 == null || A003.A08 != null) {
            z = false;
        } else {
            ((C32641hW) this.A00.get()).A01(A003, r5.A0x);
            z = true;
        }
        C693536w r3 = null;
        if ((r5 instanceof AnonymousClass210) && (A002 = C196869vm.A00((AnonymousClass210) r5)) != null) {
            r3 = A002.A00;
        }
        if (r5.A0z(32768) && r3 != null && r3.A08 == null) {
            ((C32641hW) this.A00.get()).A01(r3, r5.A0x);
        } else if (!z) {
            return;
        }
        if (r6 != null) {
            throw C17900vP.A07(AnonymousClass39N.class);
        }
    }
}
