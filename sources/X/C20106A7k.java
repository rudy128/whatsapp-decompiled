package X;

/* renamed from: X.A7k  reason: case insensitive filesystem */
public final class C20106A7k {
    public static final AnonymousClass205 A01(C166408cq r4) {
        if ((r4.bitField0_ & 1) != 0) {
            AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(r4.remoteJid_);
            if (A02 == null) {
                throw AnonymousClass8BR.A0p("Message Key is malformed: failed to parse remote JID.", 0);
            } else if ((r4.bitField0_ & 4) != 0) {
                String str = r4.id_;
                if (C108955ca.A05(str) != 0) {
                    return AnonymousClass205.A01(A02, str, r4.fromMe_);
                }
                throw AnonymousClass8BR.A0p("Message Key is malformed: ID is null or empty", 0);
            } else {
                throw AnonymousClass8BR.A0p("Message Key is malformed: no message ID set.", 0);
            }
        } else {
            throw AnonymousClass8BR.A0p("Message Key is malformed: no remote JID set.", 0);
        }
    }

    public static final void A03(AnonymousClass8X1 r3, AnonymousClass206 r4) {
        C18070vi.A0d(r3, 1);
        AnonymousClass8X7 A00 = C166408cq.A00();
        AnonymousClass205 r1 = r4.A0v;
        A00.A0H(r1.A01);
        A00.A0K(r1.A02);
        A00.A0J(C22971Dz.A06(r1.A00));
        C166408cq r0 = (C166408cq) A00.A0C();
        C166388co A0X = C17880vN.A0X(r3);
        r0.getClass();
        A0X.key_ = r0;
        A0X.bitField0_ |= 1;
    }

    public final AnonymousClass205 A05(C166388co r3) {
        if ((r3.bitField0_ & 1) != 0) {
            C166408cq r0 = r3.key_;
            if (r0 == null) {
                r0 = C166408cq.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r0);
            return A01(r0);
        }
        throw AnonymousClass8BR.A0p("Message Key was not set.", 0);
    }

    public static final long A00(C166388co r3) {
        if ((r3.bitField0_ & 4) != 0) {
            return r3.messageTimestamp_ * 1000;
        }
        return 0;
    }

    public static AnonymousClass205 A02(C166388co r1, AnonymousClass00H r2) {
        AnonymousClass205 A05 = ((C20106A7k) r2.get()).A05(r1);
        r2.get();
        return A05;
    }

    public static final void A04(AnonymousClass8X1 r3, AnonymousClass206 r4) {
        AnonymousClass1BI A0H = r4.A0H();
        if (A0H != null) {
            AnonymousClass205 r0 = r4.A0v;
            C18070vi.A0W(r0);
            AnonymousClass1BI r1 = r0.A00;
            if (C22971Dz.A0e(r1) || C22971Dz.A0a(r1)) {
                r3.A0K(A0H.getRawString());
            }
        }
    }
}
