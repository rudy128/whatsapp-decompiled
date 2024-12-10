package X;

public class AY1 implements BB8 {
    public final C22461B8t A00;
    public final C198959zC A01;
    public final /* synthetic */ A4K A02;

    public AY1(C22461B8t b8t, A4K a4k, C198959zC r3) {
        this.A02 = a4k;
        this.A01 = r3;
        this.A00 = b8t;
    }

    public void Bss(A7B a7b) {
        this.A00.C3f(a7b);
    }

    public void C7Y(String[] strArr) {
        A4K a4k = this.A02;
        C198959zC r5 = this.A01;
        String str = strArr[0];
        String str2 = strArr[1];
        C22461B8t b8t = this.A00;
        C198169xt r6 = a4k.A00;
        AnonymousClass90S r4 = new AnonymousClass90S(b8t, a4k, r5);
        byte[] A002 = C198169xt.A00(true, str, "CHANGE", str2, (byte[]) null, new Object[0], AnonymousClass11P.A00(r6.A01));
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        C17880vN.A1Q("action", "change-payment-pin", r2, 0);
        C198959zC.A00(r5, r6, r4, A002, r2);
    }
}
