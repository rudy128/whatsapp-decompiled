package X;

/* renamed from: X.8ts  reason: invalid class name and case insensitive filesystem */
public final class C172698ts extends AUK implements B87 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void BDZ(C195629te r8, AnonymousClass8X1 r9, AnonymousClass206 r10) {
        boolean A1U = AnonymousClass8BX.A1U(r10, r9, r8);
        super.BDZ(r8, r9, r10);
        AnonymousClass206 A0K = r10.A0K();
        if (r10.A0u == 103 && A0K != null) {
            C23624Bmt A0N = AnonymousClass8YZ.DEFAULT_INSTANCE.A0N();
            AnonymousClass8X8 A002 = C166418cr.A00();
            C18070vi.A0b(A002);
            C191729n5 A003 = C181349Qd.A00(A002);
            A003.A04 = A1U;
            A003.A03 = false;
            AnonymousClass8BV.A1B(A003.A00(), A0K, this.A00);
            AnonymousClass8YZ r1 = (AnonymousClass8YZ) C17880vN.A0G(A0N);
            C166418cr A0e = AnonymousClass8BR.A0e(A002);
            A0e.getClass();
            r1.quotedStatus_ = A0e;
            r1.bitField0_ |= 1;
            C166388co A0P = AnonymousClass8BS.A0P(r9);
            AnonymousClass8YZ r12 = (AnonymousClass8YZ) A0N.A0C();
            int i = C166388co.AGENT_ID_FIELD_NUMBER;
            r12.getClass();
            A0P.statusMentionMessageInfo_ = r12;
            A0P.bitField1_ |= A7Y.A0F;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172698ts(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r1);
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r2;
        this.A00 = r3;
    }

    public void CBB(C193069pU r6, C166388co r7, AnonymousClass206 r8) {
        AnonymousClass205 r2;
        boolean A16 = C18070vi.A16(r8, r7);
        AnonymousClass8YZ r0 = r7.statusMentionMessageInfo_;
        if (r0 != null || (r0 = AnonymousClass8YZ.DEFAULT_INSTANCE) != null) {
            C166418cr r3 = r0.quotedStatus_;
            if (r3 == null) {
                r3 = C166418cr.DEFAULT_INSTANCE;
            }
            AnonymousClass206 A0K = r8.A0K();
            if (A0K == null || (r2 = A0K.A0v) == null) {
                r2 = ((AnonymousClass1PP) this.A00.get()).A01(C29671cg.A00, r8.A0v.A02);
            }
            C18070vi.A0b(r2);
            C18070vi.A0b(r3);
            C192879p8 A002 = C196699vU.A00(r3, r2, r8.A0I);
            A002.A0D = A16;
            ((AnonymousClass1R0) this.A01.get()).A00(r8, AnonymousClass8BV.A0K(A002.A00(), this.A00));
        }
    }
}
