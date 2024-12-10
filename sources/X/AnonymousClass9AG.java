package X;

/* renamed from: X.9AG  reason: invalid class name */
public class AnonymousClass9AG extends AT8 {
    public final C193209pi A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C23577Bm6 bm6;
        C58072k6 r0;
        AnonymousClass8BX.A1H(r8, "FMessageTemplateImageProtobuf: message type is not supported ", AnonymousClass000.A10(), r8 instanceof C440521y);
        C440521y r82 = (C440521y) r8;
        AnonymousClass8X8 r4 = a2m.A00;
        C163918Wv A02 = AnonymousClass8X8.A02(r4);
        C193209pi r5 = this.A00;
        C166348ck r02 = ((C166418cr) r4.A00).templateMessage_;
        if (r02 == null) {
            r02 = C166348ck.DEFAULT_INSTANCE;
        }
        C165868bt A0K = AnonymousClass8BS.A0K(r02);
        if (A0K.titleCase_ == 3) {
            bm6 = (C23577Bm6) A0K.title_;
        } else {
            bm6 = C166268cc.DEFAULT_INSTANCE;
        }
        C163748We A002 = r5.A00(a2m, (C163748We) bm6.A0O(), r82);
        if (A002 == null || (r0 = r82.A00) == null) {
            AnonymousClass8BX.A1G(r82, "MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, ", AnonymousClass000.A10());
            return;
        }
        C163108Ts A003 = C181579Ra.A00(r4, r0);
        AT8.A01(r4, A02, A003, AT8.A00(A003, A002), 3);
    }

    public AnonymousClass9AG(C193209pi r1, A89 a89) {
        super(a89);
        this.A00 = r1;
    }
}
