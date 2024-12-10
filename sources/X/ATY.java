package X;

public final class ATY implements B85, C436820m, C22574BDp {
    public final AnonymousClass00H A00;

    public ATY(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ AnonymousClass206 CBG(C20077A6d a6d) {
        C17960vV.A0F(false, "parseProtobufMessage() must never be called.");
        return null;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C18070vi.A0h(r8, a2m);
        C181359Qe.A00(C22050Awq.A00, r8 instanceof AnonymousClass24D);
        AnonymousClass8XD r5 = ((AnonymousClass24D) r8).A00;
        if (r5 != null) {
            AnonymousClass8X8 r3 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r3);
            A01.A0G(C179839Kc.MEMU_ONBOARDING_MESSAGE);
            r3.A0N(A01);
            C163938Wx r4 = a2m.A01;
            C166118cN r0 = ((C166048cG) r4.A00).botMetadata_;
            if (r0 == null) {
                r0 = C166118cN.DEFAULT_INSTANCE;
            }
            C23624Bmt A07 = AnonymousClass8BS.A07(r0);
            C166118cN r1 = (C166118cN) A07.A00;
            int i = C166118cN.AVATAR_METADATA_FIELD_NUMBER;
            r1.memuMetadata_ = r5;
            r1.bitField0_ |= 64;
            r4.A0H((C166118cN) A07.A0C());
            if (!C18020vd.A05(C18040vf.A01, C17880vN.A0P(this.A00), 7772)) {
                AnonymousClass8X8.A05(r4, r3);
            }
        }
    }
}
