package X;

/* renamed from: X.ASl  reason: case insensitive filesystem */
public final class C20627ASl implements B83, B85, C436820m {
    public final C18030ve A00;
    public final A79 A01;

    public C20627ASl(C18030ve r2, A79 a79) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a79;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C18070vi.A0h(r8, a2m);
        C181359Qe.A00(C22046Awm.A00, r8 instanceof AnonymousClass247);
        if (!a2m.A06 || a2m.A07) {
            AnonymousClass8X8 r4 = a2m.A00;
            C165208al r0 = ((C166418cr) r4.A00).albumMessage_;
            if (r0 == null) {
                r0 = C165208al.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            if (C19998A2m.A00(a2m, r8)) {
                C166278cd A012 = A79.A01(A0O, this.A01, a2m, r8);
                C165208al r1 = (C165208al) A0O.A00;
                int i = C165208al.CAPTION_FIELD_NUMBER;
                A012.getClass();
                r1.contextInfo_ = A012;
                r1.bitField0_ |= 8;
            }
            AnonymousClass247 r82 = (AnonymousClass247) r8;
            int i2 = (int) r82.A02;
            int i3 = (int) r82.A03;
            if (i2 > 0 || i3 > 0) {
                C165208al r12 = (C165208al) C17880vN.A0G(A0O);
                int i4 = C165208al.CAPTION_FIELD_NUMBER;
                r12.bitField0_ |= 2;
                r12.expectedImageCount_ = i2;
                C165208al r13 = (C165208al) C17880vN.A0G(A0O);
                r13.bitField0_ |= 4;
                r13.expectedVideoCount_ = i3;
            }
            C165208al r02 = (C165208al) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r4, r02);
            A0J.albumMessage_ = r02;
            A0J.bitField2_ |= 4;
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        int i;
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField2_ & 4) == 0) {
            return null;
        }
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if ((!C18020vd.A05(r1, r2, 8528) && !C18020vd.A05(r1, r2, 8529)) || !C18020vd.A05(r1, r2, 8783)) {
            return a6d.A04(88);
        }
        C165208al r4 = A012.albumMessage_;
        if (r4 == null) {
            r4 = C165208al.DEFAULT_INSTANCE;
        }
        AnonymousClass247 r3 = new AnonymousClass247(a6d.A0A, a6d.A03);
        int i2 = r4.bitField0_;
        int i3 = 0;
        if (AnonymousClass000.A1O(i2 & 2)) {
            i = r4.expectedImageCount_;
        } else {
            i = 0;
        }
        r3.A00 = i;
        if ((i2 & 4) != 0) {
            i3 = r4.expectedVideoCount_;
        }
        r3.A01 = i3;
        return r3;
    }
}
