package X;

/* renamed from: X.8fJ  reason: invalid class name and case insensitive filesystem */
public class C167048fJ extends C20616ASa implements AnonymousClass3LE {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C61402pc.A00(r4, "scheduled_call_type", "edit");
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        AnonymousClass1BI r7;
        AnonymousClass9Jh r0;
        if (r11 instanceof C444923q) {
            C444923q r112 = (C444923q) r11;
            AnonymousClass205 A18 = r112.A18();
            A51 a51 = r112.A05;
            if (a51 == null) {
                r7 = null;
            } else {
                r7 = a51.A00;
            }
            int i = r112.A00;
            AnonymousClass8X8 r3 = a2m.A00;
            AnonymousClass8ZG r02 = ((C166418cr) r3.A00).scheduledCallEditMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8ZG.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            C166408cq r03 = ((AnonymousClass8ZG) A0O.A00).key_;
            if (r03 == null) {
                r03 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r03);
            C17960vV.A07(A18);
            boolean A17 = C18070vi.A17(A0f, A18);
            ((C191029lu) this.A02.get()).A00(r7, A0f, A18, false);
            AnonymousClass8ZG r1 = (AnonymousClass8ZG) C17880vN.A0G(A0O);
            r1.key_ = AnonymousClass8BU.A0Y(A0f);
            r1.bitField0_ |= 1;
            if (i == A17) {
                r0 = AnonymousClass9Jh.CANCEL;
            } else {
                r0 = AnonymousClass9Jh.UNKNOWN;
            }
            AnonymousClass8ZG r12 = (AnonymousClass8ZG) C17880vN.A0G(A0O);
            r12.editType_ = r0.value;
            r12.bitField0_ |= 2;
            AnonymousClass8ZG r04 = (AnonymousClass8ZG) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r3, r04);
            A0J.scheduledCallEditMessage_ = r04;
            A0J.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass000.A0k("FMessageScheduledCallEditProtobuf/not supported message");
    }

    public C167048fJ(AnonymousClass11S r1, C18030ve r2, AnonymousClass00H r3) {
        super(r2);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
