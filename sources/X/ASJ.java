package X;

public final class ASJ implements C436920n {
    public final AnonymousClass00H A00;

    public ASJ(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass206 CBH(C195239t1 r7) {
        C18070vi.A0d(r7, 0);
        C165928bz r1 = r7.A01;
        if (!AnonymousClass000.A1O(r1.bitField0_ & 32)) {
            return null;
        }
        C166168cS r4 = r1.videoMessage_;
        if (r4 == null) {
            r4 = C166168cS.DEFAULT_INSTANCE;
        }
        if (r4.gifPlayback_) {
            return null;
        }
        AnonymousClass21X r5 = new AnonymousClass21X(r7.A02, 3, r7.A00);
        this.A00.get();
        C20028A3x.A01(r4, r5);
        return r5;
    }

    public void BDc(C184489b2 r7, AnonymousClass206 r8) {
        boolean A15 = C18070vi.A15(r8, r7);
        if (r8 instanceof AnonymousClass21Y) {
            this.A00.get();
            AnonymousClass8X8 r4 = r7.A00;
            C163928Ww A002 = C20028A3x.A00(AnonymousClass8X8.A03(r4), (AnonymousClass21W) r8, r7.A01);
            if (A002 != null) {
                AnonymousClass21V r1 = (AnonymousClass21V) r8;
                C62572rc r0 = r1.A02;
                if (r0 == null || r0.A0a == null) {
                    AnonymousClass8BX.A1G(r8, "FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=", AnonymousClass000.A10());
                } else {
                    C693436v A17 = r1.A17();
                    C17960vV.A07(A17);
                    byte[] A06 = A17.A06();
                    if (A06 != null) {
                        C23581BmB A0F = AnonymousClass8BR.A0F(A06, A15);
                        C166248ca A0L = AnonymousClass8BS.A0L(A002);
                        A0L.bitField0_ |= 32768;
                        A0L.streamingSidecar_ = A0F;
                    }
                }
                r4.A0T((C166248ca) A002.A0C());
                return;
            }
            return;
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}
