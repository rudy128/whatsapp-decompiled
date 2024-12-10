package X;

/* renamed from: X.9m0  reason: invalid class name and case insensitive filesystem */
public class C191089m0 {
    public final AnonymousClass1QO A00;
    public final A27 A01;
    public final BD4 A02;
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("ErrorMapGatingManager", "payment", "COMMON");

    public C191089m0(AnonymousClass1QO r4, A27 a27, BD4 bd4) {
        this.A00 = r4;
        this.A01 = a27;
        this.A02 = bd4;
    }

    public String A00(int i) {
        String str;
        String valueOf = String.valueOf(i);
        if (C18020vd.A05(C18040vf.A02, this.A00.A02, 698)) {
            str = this.A01.A03(valueOf);
        } else {
            str = null;
        }
        BD4 bd4 = this.A02;
        if (bd4 != null) {
            C171858sO BHN = bd4.BHN();
            BHN.A08 = C17880vN.A0k();
            BHN.A0b = "error";
            BHN.A0S = valueOf;
            if (str != null) {
                BHN.A0T = str;
            }
            AnonymousClass8BX.A1D(this.A03, bd4, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass000.A10());
            bd4.BiH(BHN);
        }
        return str;
    }
}
