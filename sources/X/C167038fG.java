package X;

/* renamed from: X.8fG  reason: invalid class name and case insensitive filesystem */
public final class C167038fG extends C20616ASa {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;

    public void BDb(C19998A2m a2m, AnonymousClass206 r13) {
        AnonymousClass1BI r1;
        AnonymousClass9KJ r0;
        boolean A17 = C18070vi.A17(r13, a2m);
        if (r13 instanceof AnonymousClass22A) {
            AnonymousClass22A r132 = (AnonymousClass22A) r13;
            AnonymousClass205 A18 = r132.A18();
            A51 a51 = r132.A05;
            if (a51 == null) {
                r1 = null;
            } else {
                r1 = a51.A00;
            }
            int i = r132.A01;
            long j = r132.A02;
            AnonymousClass8X8 r4 = a2m.A00;
            C164848aA r02 = ((C166418cr) r4.A00).keepInChatMessage_;
            if (r02 == null) {
                r02 = C164848aA.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            C166408cq r03 = ((C164848aA) A0O.A00).key_;
            if (r03 == null) {
                r03 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r03);
            if (A18 != null) {
                C18070vi.A0b(A0f);
                ((C191029lu) this.A01.get()).A00(r1, A0f, A18, false);
                C164848aA r12 = (C164848aA) C17880vN.A0G(A0O);
                r12.key_ = AnonymousClass8BU.A0Y(A0f);
                r12.bitField0_ |= 1;
                if (i == A17) {
                    r0 = AnonymousClass9KJ.KEEP_FOR_ALL;
                } else {
                    r0 = AnonymousClass9KJ.UNDO_KEEP_FOR_ALL;
                }
                C164848aA r14 = (C164848aA) C17880vN.A0G(A0O);
                r14.keepType_ = r0.value;
                r14.bitField0_ |= 2;
                C164848aA r15 = (C164848aA) C17880vN.A0G(A0O);
                r15.bitField0_ |= 4;
                r15.timestampMs_ = j;
                C164848aA r04 = (C164848aA) A0O.A0C();
                C166418cr A0J = AnonymousClass8BV.A0J(r4, r04);
                A0J.keepInChatMessage_ = r04;
                A0J.bitField1_ |= 256;
                return;
            }
            throw C17880vN.A0g();
        }
        throw AnonymousClass000.A0k("FMessageKeepInChatProtobuf/not supported message");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167038fG(AnonymousClass11S r1, C18030ve r2, AnonymousClass00H r3) {
        super(r2);
        C18070vi.A0o(r2, r1, r3);
        this.A00 = r1;
        this.A01 = r3;
    }
}
