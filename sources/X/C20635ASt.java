package X;

/* renamed from: X.ASt  reason: case insensitive filesystem */
public final class C20635ASt implements B83, B85, C436820m {
    public final C18030ve A00;
    public final C199179zZ A01;

    public C20635ASt(C18030ve r2, C199179zZ r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        boolean A16 = C18070vi.A16(r9, a2m);
        if (r9 instanceof C444523m) {
            AnonymousClass8X8 r4 = a2m.A00;
            C163988Xc r0 = ((C166418cr) r4.A00).viewOnceMessageV2Extension_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            AnonymousClass8X6 r6 = (AnonymousClass8X6) r0.A0O();
            AnonymousClass8X8 A002 = AnonymousClass8X6.A00(r6);
            AnonymousClass8SR A012 = this.A01.A01(a2m, (C441722k) r9);
            if (A012 == null) {
                AnonymousClass8BY.A10(r9, "FMessageViewOnceAudio/unable to send encrypted media message due to missing mediaKey; key=", AnonymousClass000.A10());
                return;
            }
            C166138cP A0E = AnonymousClass8BS.A0E(A012);
            A0E.bitField0_ |= 16384;
            A0E.viewOnce_ = A16;
            if (C18020vd.A05(C18040vf.A02, this.A00, 8784)) {
                C166138cP r02 = (C166138cP) A012.A0C();
                C166418cr A0J = AnonymousClass8BV.A0J(r4, r02);
                A0J.audioMessage_ = r02;
                A0J.bitField0_ |= 128;
                return;
            }
            A002.A0H(A012);
            C163988Xc A013 = AnonymousClass8X6.A01(A002, r6);
            C166418cr A0J2 = AnonymousClass8BV.A0J(r4, A013);
            A0J2.viewOnceMessageV2Extension_ = A013;
            A0J2.bitField1_ |= 16384;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass206.A07(r9, "FMessageViewOnceAudioProtobuf not support: ", A10);
        throw AnonymousClass000.A0j(A10);
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & 128) == 0) {
            return null;
        }
        C166138cP r1 = A012.audioMessage_;
        C166138cP r5 = r1;
        if (r1 == null) {
            r1 = C166138cP.DEFAULT_INSTANCE;
        }
        if ((r1.bitField0_ & 16384) == 0 || !r1.viewOnce_) {
            return null;
        }
        if (r5 == null) {
            r5 = C166138cP.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r4 = a6d.A0A;
        C441722k r12 = new C441722k(r4, 82, a6d.A03);
        C199179zZ.A00(r5, r4, r12, a6d.A05());
        return r12;
    }
}
