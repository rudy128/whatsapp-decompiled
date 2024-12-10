package X;

/* renamed from: X.8fE  reason: invalid class name and case insensitive filesystem */
public final class C167018fE extends AUV {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167018fE(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r1, r2, r3);
        C18070vi.A0o(r1, r2, r3);
    }

    public void C1A(C195629te r7, AnonymousClass8X1 r8, AnonymousClass206 r9) {
        AnonymousClass9K6 r0;
        boolean A1U = AnonymousClass8BX.A1U(r9, r8, r7);
        if (!r9.A10(8)) {
            return;
        }
        if (r7.A06) {
            super.C1A(r7, r8, r9);
            return;
        }
        AnonymousClass22C A03 = C63892tr.A03(r9);
        if (A03 != null) {
            C23624Bmt A0N = C165588bR.DEFAULT_INSTANCE.A0N();
            AnonymousClass8X7 A00 = A3J.A00(A03);
            C165588bR r1 = (C165588bR) C17880vN.A0G(A0N);
            r1.key_ = AnonymousClass8BU.A0Y(A00);
            r1.bitField0_ |= 2;
            if (A03.A00 == A1U) {
                r0 = AnonymousClass9K6.PIN_FOR_ALL;
            } else {
                r0 = AnonymousClass9K6.UNPIN_FOR_ALL;
            }
            C165588bR r12 = (C165588bR) C17880vN.A0G(A0N);
            r12.type_ = r0.value;
            r12.bitField0_ |= 1;
            long j = A03.A01;
            C165588bR r13 = (C165588bR) C17880vN.A0G(A0N);
            r13.bitField0_ |= 4;
            r13.senderTimestampMs_ = j;
            long j2 = A03.A03;
            C165588bR r14 = (C165588bR) C17880vN.A0G(A0N);
            r14.bitField0_ |= 8;
            r14.serverTimestampMs_ = j2;
            AnonymousClass8WA A01 = A3J.A01(A03);
            if (A01 != null) {
                C165588bR r15 = (C165588bR) C17880vN.A0G(A0N);
                C164578Zj r02 = (C164578Zj) A01.A0C();
                r02.getClass();
                r15.messageAddOnContextInfo_ = r02;
                r15.bitField0_ |= 16;
            }
            C166388co A0P = AnonymousClass8BS.A0P(r8);
            C165588bR r16 = (C165588bR) A0N.A0C();
            int i = C166388co.AGENT_ID_FIELD_NUMBER;
            r16.getClass();
            A0P.pinInChat_ = r16;
            A0P.bitField1_ |= 128;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1B(X.C193069pU r11, X.C166388co r12, X.AnonymousClass206 r13) {
        /*
            r10 = this;
            boolean r7 = X.C18070vi.A16(r12, r13)
            r9 = 2
            X.C18070vi.A0d(r11, r9)
            super.C1B(r11, r12, r13)
            X.22C r0 = X.C63892tr.A03(r13)
            if (r0 != 0) goto L_0x0084
            int r0 = r12.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0084
            X.A51 r6 = X.A51.A00(r13)
            long r3 = r13.A0x
            X.8bR r5 = r12.pinInChat_
            if (r5 != 0) goto L_0x0023
            X.8bR r5 = X.C165588bR.DEFAULT_INSTANCE
        L_0x0023:
            X.00H r2 = r10.A01
            r2.get()
            long r0 = X.C20106A7k.A00(r12)
            r2.get()
            X.8cq r2 = r5.key_
            if (r2 != 0) goto L_0x0035
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0035:
            X.C18070vi.A0X(r2)
            X.205 r8 = X.C20106A7k.A01(r2)
            X.22C r2 = new X.22C
            r2.<init>(r8, r0)
            int r0 = r5.type_
            if (r0 == 0) goto L_0x0088
            if (r0 == r7) goto L_0x0085
            if (r0 != r9) goto L_0x0088
            X.9K6 r0 = X.AnonymousClass9K6.UNPIN_FOR_ALL
        L_0x004b:
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r7) goto L_0x0053
            r0 = 0
        L_0x0053:
            r2.A00 = r0
            long r0 = r5.senderTimestampMs_
            r2.A01 = r0
            long r0 = r5.serverTimestampMs_
            r2.A1A(r0)
            r2.A05 = r6
            r2.A02 = r3
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x007c
            X.00H r0 = r10.A00
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.0ve r1 = (X.C18030ve) r1
            X.8Zj r0 = r5.messageAddOnContextInfo_
            if (r0 != 0) goto L_0x0076
            X.8Zj r0 = X.C164578Zj.DEFAULT_INSTANCE
        L_0x0076:
            X.C18070vi.A0X(r0)
            X.A3J.A02(r1, r0, r2)
        L_0x007c:
            X.C63892tr.A06(r13, r2)
            r0 = 8
            r13.A0W(r0)
        L_0x0084:
            return
        L_0x0085:
            X.9K6 r0 = X.AnonymousClass9K6.PIN_FOR_ALL
            goto L_0x004b
        L_0x0088:
            X.9K6 r0 = X.AnonymousClass9K6.UNKNOWN_TYPE
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167018fE.C1B(X.9pU, X.8co, X.206):void");
    }
}
