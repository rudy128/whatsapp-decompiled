package X;

/* renamed from: X.ASy  reason: case insensitive filesystem */
public class C20640ASy implements B83, B85, C436820m {
    public final A79 A00;
    public final C193209pi A01;
    public final ASL A02;

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        AnonymousClass8BX.A1H(r8, "FMessageImageProtobuf: message type is not supported ", AnonymousClass000.A10(), r8 instanceof C438421d);
        C438321c r82 = (C438321c) r8;
        if (AnonymousClass8BV.A1R(r82)) {
            this.A02.A00(new C20612ARw(this, 3), a2m, r82);
            return;
        }
        C193209pi r1 = this.A01;
        AnonymousClass8X8 r4 = a2m.A00;
        C166268cc r0 = ((C166418cr) r4.A00).imageMessage_;
        if (r0 == null) {
            r0 = C166268cc.DEFAULT_INSTANCE;
        }
        C163748We A012 = r1.A01(a2m, (C163748We) r0.A0O(), r82);
        if (A012 != null) {
            C693236t A002 = C60512o9.A00(r82);
            if (A002 != null && A002.A01.equals(AnonymousClass6RT.EVENT_COVER_IMAGE)) {
                C163988Xc r02 = ((C166418cr) r4.A00).eventCoverImage_;
                if (r02 == null) {
                    r02 = C163988Xc.DEFAULT_INSTANCE;
                }
                AnonymousClass8X6 r3 = (AnonymousClass8X6) r02.A0O();
                AnonymousClass8X8 A003 = AnonymousClass8X6.A00(r3);
                C166418cr A0M = AnonymousClass8BS.A0M(A003);
                C166268cc r03 = (C166268cc) A012.A0C();
                r03.getClass();
                A0M.imageMessage_ = r03;
                A0M.bitField0_ |= 4;
                r3.A0H(A003);
                C166418cr A0M2 = AnonymousClass8BS.A0M(r4);
                C163988Xc r04 = (C163988Xc) r3.A0C();
                r04.getClass();
                A0M2.eventCoverImage_ = r04;
                A0M2.bitField2_ |= 8;
            } else if (!r82.A0z(8) || AnonymousClass8BR.A0i(r82) == null) {
                C166268cc r05 = (C166268cc) A012.A0C();
                C166418cr A04 = AnonymousClass8X8.A04(r4, r05);
                A04.imageMessage_ = r05;
                A04.bitField0_ |= 4;
            } else {
                C165858bs r06 = ((C166418cr) r4.A00).buttonsMessage_;
                if (r06 == null) {
                    r06 = C165858bs.DEFAULT_INSTANCE;
                }
                C163728Wc r32 = (C163728Wc) r06.A0O();
                C23577Bm6 A09 = AnonymousClass8BS.A09(A012, r32);
                C165858bs r12 = (C165858bs) r32.A00;
                int i = C165858bs.BUTTONS_FIELD_NUMBER;
                A09.getClass();
                r12.header_ = A09;
                r12.headerCase_ = 3;
                r32.A0G(AnonymousClass9KT.IMAGE);
                C20097A7a.A04(r32, AnonymousClass8BR.A0i(r82));
                r4.A0I((C165858bs) r32.A0C());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.21c, X.21V, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 4) == 0 && (r1.bitField2_ & 8) == 0) {
            return null;
        }
        C166268cc r2 = r1.imageMessage_;
        C166268cc r4 = r2;
        if (r2 == null) {
            r2 = C166268cc.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 524288) != 0 && r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = C166268cc.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r3 = a6d.A0A;
        long j = a6d.A03;
        C18070vi.A0d(r3, 1);
        ? r5 = new AnonymousClass21V(r3, 1, j);
        this.A01.A02(r4, r5, a6d.A00, a6d.A05(), a6d.A0L);
        return r5;
    }

    public C20640ASy(ASL asl, A79 a79, C193209pi r3) {
        this.A02 = asl;
        this.A00 = a79;
        this.A01 = r3;
    }
}
