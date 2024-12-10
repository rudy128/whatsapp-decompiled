package X;

public class AY0 implements BB8 {
    public final /* synthetic */ C198739yp A00;
    public final /* synthetic */ C198959zC A01;
    public final /* synthetic */ C190769lU A02;

    public AY0(C198739yp r1, C198959zC r2, C190769lU r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void Bss(A7B a7b) {
        this.A02.A00(a7b);
    }

    public void C7Y(String[] strArr) {
        C198739yp r7 = this.A00;
        C31061ex r0 = r7.A03;
        AnonymousClass1MD[] r4 = new AnonymousClass1MD[4];
        r4[1] = AnonymousClass8BR.A0h("token", strArr[C17890vO.A1W("action", "reset-payment-pin", r4)]);
        C17890vO.A12("credential-id", r7.A0A, r4);
        AnonymousClass8BV.A1O("device-id", r7.A09.A01(), r4);
        C198169xt r1 = r7.A08;
        C198959zC r8 = this.A01;
        C29621ca r12 = new C29621ca(r8.A01(C198169xt.A00((Boolean) null, (Object) null, "RESET", strArr[1], (byte[]) null, new Object[0], AnonymousClass11P.A00(r1.A01))), "account", r4);
        C190769lU r6 = this.A02;
        r0.A0I(new C175488yn(r7.A00, r7.A02, r7.A01, r6, r7, r8, 8), r12, "set", C20113A7w.A0L);
    }
}
