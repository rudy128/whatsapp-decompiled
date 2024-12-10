package X;

/* renamed from: X.9AH  reason: invalid class name */
public class AnonymousClass9AH extends AT8 {
    public final C198969zD A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        C23577Bm6 bm6;
        C58072k6 r0;
        AnonymousClass8BX.A1H(r7, "FMessageTemplateLocationProtobuf: message type is not supported ", AnonymousClass000.A10(), r7 instanceof AnonymousClass220);
        AnonymousClass220 r72 = (AnonymousClass220) r7;
        AnonymousClass8X8 r4 = a2m.A00;
        C163918Wv A02 = AnonymousClass8X8.A02(r4);
        C166348ck r02 = ((C166418cr) r4.A00).templateMessage_;
        if (r02 == null) {
            r02 = C166348ck.DEFAULT_INSTANCE;
        }
        C165868bt A0K = AnonymousClass8BS.A0K(r02);
        if (A0K.titleCase_ == 5) {
            bm6 = (C23577Bm6) A0K.title_;
        } else {
            bm6 = C166028cE.DEFAULT_INSTANCE;
        }
        AnonymousClass8TF r1 = (AnonymousClass8TF) bm6.A0O();
        this.A00.A01(a2m, r1, r72);
        if (r1 == null || (r0 = r72.A00) == null) {
            AnonymousClass8BX.A1G(r72, "FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, ", AnonymousClass000.A10());
            return;
        }
        C163108Ts A002 = C181579Ra.A00(r4, r0);
        AT8.A01(r4, A02, A002, AT8.A00(A002, r1), 5);
    }

    public AnonymousClass9AH(C198969zD r1, A89 a89) {
        super(a89);
        this.A00 = r1;
    }
}
