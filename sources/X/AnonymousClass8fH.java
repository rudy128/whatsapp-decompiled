package X;

/* renamed from: X.8fH  reason: invalid class name */
public final class AnonymousClass8fH extends C20616ASa {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public void BDb(C19998A2m a2m, AnonymousClass206 r10) {
        AnonymousClass1BI r0;
        C179779Jw r02;
        boolean A17 = C18070vi.A17(r10, a2m);
        if (r10 instanceof AnonymousClass22C) {
            AnonymousClass22C r102 = (AnonymousClass22C) r10;
            AnonymousClass8X8 r4 = a2m.A00;
            C164888aE r03 = ((C166418cr) r4.A00).pinInChatMessage_;
            if (r03 == null) {
                r03 = C164888aE.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r03.A0O();
            C166408cq r04 = ((C164888aE) A0O.A00).key_;
            if (r04 == null) {
                r04 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r04);
            AnonymousClass205 A18 = r102.A18();
            C17960vV.A07(A18);
            C18070vi.A0X(A18);
            C191029lu r1 = (C191029lu) this.A02.get();
            C18070vi.A0b(A0f);
            A51 a51 = r102.A05;
            if (a51 == null) {
                r0 = null;
            } else {
                r0 = a51.A00;
            }
            r1.A00(r0, A0f, A18, false);
            C164888aE r12 = (C164888aE) C17880vN.A0G(A0O);
            r12.key_ = AnonymousClass8BU.A0Y(A0f);
            r12.bitField0_ |= 1;
            if (r102.A00 == A17) {
                r02 = C179779Jw.PIN_FOR_ALL;
            } else {
                r02 = C179779Jw.UNPIN_FOR_ALL;
            }
            C164888aE r13 = (C164888aE) C17880vN.A0G(A0O);
            r13.type_ = r02.value;
            r13.bitField0_ |= 2;
            long j = r102.A01;
            C164888aE r14 = (C164888aE) C17880vN.A0G(A0O);
            r14.bitField0_ |= 4;
            r14.senderTimestampMs_ = j;
            C164888aE r05 = (C164888aE) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r4, r05);
            A0J.pinInChatMessage_ = r05;
            A0J.bitField1_ |= 262144;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FMessagePinInChatProtobuf not supported message: ");
        throw AnonymousClass001.A12(C17890vO.A0U(r10), A10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fH(AnonymousClass11S r1, C18030ve r2, AnonymousClass00H r3) {
        super(r2);
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
