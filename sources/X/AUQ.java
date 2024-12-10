package X;

public final class AUQ implements C22511BAs {
    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        C18070vi.A0h(r7, r6);
        String A00 = C196879vn.A00(r7);
        if (A00 != null) {
            C23624Bmt A08 = AnonymousClass8BS.A08(AnonymousClass8YX.DEFAULT_INSTANCE);
            AnonymousClass8YX r1 = (AnonymousClass8YX) A08.A00;
            r1.bitField0_ |= 1;
            r1.serverCampaignId_ = A00;
            C166388co A0P = AnonymousClass8BS.A0P(r6);
            AnonymousClass8YX r12 = (AnonymousClass8YX) A08.A0C();
            int i = C166388co.AGENT_ID_FIELD_NUMBER;
            r12.getClass();
            A0P.premiumMessageInfo_ = r12;
            A0P.bitField1_ |= 256;
        }
    }

    public void C1B(C193069pU r2, C166388co r3, AnonymousClass206 r4) {
        C18070vi.A0h(r3, r4);
        if ((r3.bitField1_ & 256) != 0) {
            AnonymousClass8YX r0 = r3.premiumMessageInfo_;
            if (r0 == null) {
                r0 = AnonymousClass8YX.DEFAULT_INSTANCE;
            }
            C196879vn.A01(r4, r0.serverCampaignId_);
        }
    }
}
