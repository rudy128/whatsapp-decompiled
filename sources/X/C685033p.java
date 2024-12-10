package X;

/* renamed from: X.33p  reason: invalid class name and case insensitive filesystem */
public final class C685033p implements C22511BAs {
    public final C18030ve A00;
    public final AnonymousClass1MB A01;

    public /* synthetic */ void C1B(C193069pU r1, C166388co r2, AnonymousClass206 r3) {
    }

    public C685033p(C18030ve r1, AnonymousClass1MB r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        boolean A16 = C18070vi.A16(r7, r6);
        if (this.A01.A03(r7.A0v.A00) && r7.A11(268435456)) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 10107)) {
                C166388co A0X = C17880vN.A0X(r6);
                A0X.bitField1_ |= 512;
                A0X.is1PBizBotMessage_ = A16;
                C166388co r2 = (C166388co) C17880vN.A0G(r6);
                r2.bitField1_ |= 262144;
                r2.isSupportAiMessage_ = A16;
            }
        }
    }
}
