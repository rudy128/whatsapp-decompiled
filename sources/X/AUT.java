package X;

public final class AUT implements C22511BAs {
    public final AnonymousClass00H A00;

    public AUT(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C1A(C195629te r8, AnonymousClass8X1 r9, AnonymousClass206 r10) {
        AnonymousClass9KJ r0;
        boolean A16 = C18070vi.A16(r10, r9);
        AnonymousClass22A A02 = C63892tr.A02(r10);
        if (A02 != null) {
            C23624Bmt A0N = C165728bf.DEFAULT_INSTANCE.A0N();
            if (r10.A0C() == A16) {
                r0 = AnonymousClass9KJ.KEEP_FOR_ALL;
            } else {
                r0 = AnonymousClass9KJ.UNDO_KEEP_FOR_ALL;
            }
            C165728bf r1 = (C165728bf) C17880vN.A0G(A0N);
            r1.keepType_ = r0.value;
            r1.bitField0_ |= 1;
            long j = A02.A0I;
            C165728bf r4 = (C165728bf) C17880vN.A0G(A0N);
            r4.bitField0_ |= 2;
            r4.serverTimestamp_ = j;
            long j2 = A02.A0I;
            C165728bf r12 = (C165728bf) C17880vN.A0G(A0N);
            r12.bitField0_ |= 32;
            r12.serverTimestampMs_ = j2;
            long j3 = A02.A02;
            C165728bf r13 = (C165728bf) C17880vN.A0G(A0N);
            r13.bitField0_ |= 16;
            r13.clientTimestampMs_ = j3;
            AnonymousClass8X7 A002 = C166408cq.A00();
            AnonymousClass205 r14 = A02.A0v;
            AnonymousClass8X7.A02(r14.A00, A002, r14);
            A002.A0H(r14.A01);
            C166408cq A0Z = AnonymousClass8BU.A0Z(A002, A0N);
            C165728bf r15 = (C165728bf) A0N.A00;
            A0Z.getClass();
            r15.key_ = A0Z;
            r15.bitField0_ |= 4;
            C166388co A0P = AnonymousClass8BS.A0P(r9);
            C165728bf r16 = (C165728bf) A0N.A0C();
            int i = C166388co.AGENT_ID_FIELD_NUMBER;
            r16.getClass();
            A0P.keepInChat_ = r16;
            A0P.bitField1_ |= 8;
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.212, X.22A] */
    public void C1B(C193069pU r13, C166388co r14, AnonymousClass206 r15) {
        boolean A16 = C18070vi.A16(r14, r15);
        if ((r14.bitField1_ & 8) != 0) {
            AnonymousClass00H r6 = this.A00;
            r6.get();
            long A002 = C20106A7k.A00(r14);
            A51 A003 = A51.A00(r15);
            long j = r15.A0x;
            C165728bf r5 = r14.keepInChat_;
            if (r5 == null) {
                r5 = C165728bf.DEFAULT_INSTANCE;
            }
            AnonymousClass9KJ A004 = AnonymousClass9KJ.A00(r5.keepType_);
            if (A004 == null) {
                A004 = AnonymousClass9KJ.UNKNOWN;
            }
            boolean A1T = AnonymousClass000.A1T(A004.ordinal(), A16 ? 1 : 0);
            r6.get();
            C166408cq r0 = r5.key_;
            if (r0 == null) {
                r0 = C166408cq.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r0);
            AnonymousClass205 A01 = C20106A7k.A01(r0);
            long j2 = r5.clientTimestampMs_;
            ? r02 = new AnonymousClass212(A01, 68, A002);
            r02.A05 = A003;
            r02.A04 = null;
            r02.A02 = j;
            r02.A01 = A1T ? 1 : 0;
            r02.A02 = j2;
            C63892tr.A05(r15, r02);
            r15.A0W(4);
        }
    }
}
